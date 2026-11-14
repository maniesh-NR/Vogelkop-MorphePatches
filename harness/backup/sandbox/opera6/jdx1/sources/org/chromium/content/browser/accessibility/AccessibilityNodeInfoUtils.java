package org.chromium.content.browser.accessibility;

import android.graphics.Rect;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccessibilityNodeInfoUtils {
    public static Rect a(Rect rect, SparseArray sparseArray) {
        Rect rect2;
        if (!rect.isEmpty()) {
            Rect rect3 = null;
            if (rect.isEmpty()) {
                rect2 = null;
            } else {
                long j = 0;
                rect2 = null;
                for (int i = 0; i < sparseArray.size(); i++) {
                    Rect rect4 = (Rect) sparseArray.valueAt(i);
                    Rect rect5 = new Rect(rect);
                    if (rect5.intersect(rect4)) {
                        long jWidth = rect5.width() * rect5.height();
                        if (jWidth > j) {
                            rect2 = rect5;
                            j = jWidth;
                        }
                    }
                }
            }
            if (rect2 != null) {
                if ((rect2.width() * rect2.height()) / (rect.width() * rect.height()) > 0.75f) {
                    return null;
                }
                Rect[] rectArr = {new Rect(rect.left, rect.top, rect2.left, rect.bottom), new Rect(rect2.right, rect.top, rect.right, rect.bottom), new Rect(rect.left, rect.top, rect.right, rect2.top), new Rect(rect.left, rect2.bottom, rect.right, rect.bottom)};
                long j2 = -1;
                Rect rect6 = null;
                for (int i2 = 0; i2 < 4; i2++) {
                    Rect rect7 = rectArr[i2];
                    long jWidth2 = rect7.width() * rect7.height();
                    if (jWidth2 > j2) {
                        rect6 = rect7;
                        j2 = jWidth2;
                    }
                }
                if (rect6 != null && rect6.width() > 0 && rect6.height() > 0 && j2 < rect.width() * rect.height()) {
                    rect3 = rect6;
                }
                if (rect3 != null) {
                    return rect3;
                }
            }
        }
        return rect;
    }

    public static String b(int i, int i2) {
        return "{" + i + ", " + (i2 == 0 ? "text" : "child") + "}";
    }

    public static <K> Map<K, int[][]> createTextAttributeRangesMap() {
        return new HashMap();
    }

    public static void setTextAttributeRangesMapFloatValue(Map<Float, int[][]> map, float f, int[] iArr, int[] iArr2) {
        Float fValueOf = Float.valueOf(f);
        if (map == null || iArr == null || iArr2 == null) {
            return;
        }
        map.put(fValueOf, new int[][]{iArr, iArr2});
    }

    public static void setTextAttributeRangesMapIntValue(Map<Integer, int[][]> map, int i, int[] iArr, int[] iArr2) {
        Integer numValueOf = Integer.valueOf(i);
        if (map == null || iArr == null || iArr2 == null) {
            return;
        }
        map.put(numValueOf, new int[][]{iArr, iArr2});
    }

    public static void setTextAttributeRangesMapStringValue(Map<String, int[][]> map, String str, int[] iArr, int[] iArr2) {
        if (map == null || str == null || iArr == null || iArr2 == null) {
            return;
        }
        map.put(str, new int[][]{iArr, iArr2});
    }
}
