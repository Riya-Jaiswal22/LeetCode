class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int l1,b1,l2,b2;
        int cx1,cx2,cy1,cy2;
        l1 = Math.abs(ax2-ax1);
        b1 = Math.abs(ay2-ay1);
        l2 = Math.abs(bx2-bx1);
        b2 = Math.abs(by2-by1);
        cx1 = Math.max(ax1,bx1);
        cx2 = Math.min(ax2,bx2);
        cy1 = Math.max(ay1,by1);
        cy2 = Math.min(ay2,by2);
        int overlap_area = Math.max(0,cx2-cx1)*Math.max(0,cy2-cy1);
        return l1*b1 + l2*b2 - overlap_area; 
    }
}