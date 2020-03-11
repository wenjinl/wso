$(function (){
    $('#man').click(function() {
        $("#message").toggle();
    })
    $('#lgn').click(function() {
        $("#message").toggle();
    })
    $('#message').mouseover(function() {
        $("#message").show();
    })
    $('#message').mouseout(function() {
        $("#message").hide();
    })
})
var nod;
function loadMainTree(kidStr) {
    var url=serverUrl+"/wsg/gate/out/getMainTree?pid=" + kidStr+'&accKid='+accKid+'&webCode='+webCode;
    $('#moduleTree' + kidStr).tree({
        loader:function(param,success,error) {
            //跨域请求数据
            $.ajax({
                async : false,
                url : url,
                type : "get",
                dataType : "jsonp",
                jsonp : "callback",
                jsonpCallback : "callback"+ kidStr,
                success : function(res) {
                    success(res);
                },
                error : function(xhr) {
                    error(xhr.responseText);
                }
            })
        }, onClick : function(node) {
            var fld = $('#moduleTree' + kidStr).tree('isLeaf', node.target);
            if (fld) {
                if(node.id==30){
                    goWsg();
                    return;
                }
                addTab(node.text, node.id, node.attributes.url);
            }
        },
    })
}

function addTab(title,moduleId,url) {
    var p=url.indexOf('?');
    if(p<0){
        url+='?';
    }
    url += "&moduleId="+moduleId;
    if ($('#tt').tabs('exists', title)) {
        $('#tt').tabs('select', title);
    } else {
        var content = '<iframe scrolling="auto" frameborder="0" id="mainIframe"  src="' + url
            + '" style="width:100%;height:100%;"></iframe>';
        $('#tt').tabs('add', {
            title : title,
            id : 'tab' + moduleId,
            content : content,
            closable : true
        });
    }
}

