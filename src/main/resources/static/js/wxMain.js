/**
 * 获取参数
 * @param sParam
 * @returns {boolean}
 */
function getUrlParameter(sParam) {
    //debugger
    var sPageURL = decodeURIComponent(window.location.search.substring(1)),
        sURLVariables = sPageURL.split('&'),
        sParameterName,
        i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : sParameterName[1];
        }
    }
}

function isEmptyStr(str) {
    return str == '' || str == 'undefined' || str == undefined || str == null;
}

function isNotEmptyStr(str) {
    return str != '' && str != 'undefined' && str != undefined && str != null;
}

function gotoHTML(url) {
    url = url + "#wechat_redirect";
    window.open(url, "_self");
}