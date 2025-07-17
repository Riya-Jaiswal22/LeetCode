/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    var res = new Array();
    var j = 0;
    for(var i=0;i<arr.length;i++){
        if(fn(arr[i],i)){
            res[j] = arr[i];
            j++;
        }
    }
    return res;
};