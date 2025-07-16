/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var res = new Array(arr.length);
    for(var i=0;i<arr.length;i++){
        res[i] = fn(arr[i],i);
    }
    return res;
};