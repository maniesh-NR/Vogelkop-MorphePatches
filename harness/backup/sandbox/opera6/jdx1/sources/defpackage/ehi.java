package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class ehi {
    public static final int[] a;
    public static final int[] b;

    static {
        Pair[] pairArr = {new Pair(9, 32), new Pair(10, 32), new Pair(11, 32), new Pair(12, 32), new Pair(13, 32), new Pair(133, 32), new Pair(8232, 32), new Pair(8233, 32), new Pair(1564, 0), new Pair(8206, 0), new Pair(8207, 0), new Pair(8234, 0), new Pair(8235, 0), new Pair(8236, 0), new Pair(8237, 0), new Pair(8238, 0), new Pair(8294, 0), new Pair(8295, 0), new Pair(8296, 0), new Pair(8297, 0), new Pair(65279, 0)};
        TreeMap treeMap = new TreeMap();
        rbd.g(treeMap, pairArr);
        Collection collectionValues = treeMap.values();
        if (!collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() < 0) {
                    qp2.o("Failed requirement.");
                    return;
                }
            }
        }
        Iterator it2 = treeMap.keySet().iterator();
        int size = treeMap.size() << 1;
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            if (!it2.hasNext()) {
                it2 = treeMap.values().iterator();
            }
            iArr[i] = ((Number) it2.next()).intValue();
        }
        a = iArr;
        int i2 = 0;
        a[] aVarArr = {new IntRange(0, 8, 1), new IntRange(14, 31, 1), new IntRange(127, 132, 1), new IntRange(134, 159, 1)};
        for (int i3 = 1; i3 < 4; i3++) {
            if (aVarArr[i3 - 1].b >= aVarArr[i3].a) {
                qp2.o("Failed requirement.");
                return;
            }
        }
        int[] iArr2 = new int[8];
        while (i2 < 8) {
            iArr2[i2] = i2 < 4 ? aVarArr[i2].a : aVarArr[i2 - 4].b;
            i2++;
        }
        b = iArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.lang.String r12) {
        /*
            r0 = 0
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r12.length()
            r5 = 2
            r6 = 1
            if (r2 >= r4) goto L8c
            char r4 = r12.charAt(r2)
            int r7 = r2 + 1
            char r8 = (char) r4
            boolean r9 = java.lang.Character.isSurrogate(r8)
            if (r9 == 0) goto L3d
            boolean r9 = java.lang.Character.isHighSurrogate(r8)
            if (r9 == 0) goto L3f
            int r9 = r12.length()
            if (r7 != r9) goto L2d
            if (r0 != 0) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            goto L8c
        L2d:
            char r9 = r12.charAt(r7)
            boolean r10 = java.lang.Character.isLowSurrogate(r9)
            if (r10 == 0) goto L3f
            int r4 = java.lang.Character.toCodePoint(r8, r9)
            int r7 = r2 + 2
        L3d:
            r8 = r1
            goto L40
        L3f:
            r8 = r6
        L40:
            int[] r9 = defpackage.ehi.a
            int r10 = r9.length
            int r10 = r10 / r5
            int r10 = java.util.Arrays.binarySearch(r9, r1, r10, r4)
            if (r10 >= 0) goto L4c
            r9 = -1
            goto L51
        L4c:
            int r11 = r9.length
            int r11 = r11 / r5
            int r11 = r11 + r10
            r9 = r9[r11]
        L51:
            if (r9 >= 0) goto L6c
            int[] r10 = defpackage.ehi.b
            int r11 = r10.length
            int r11 = r11 / r5
            int r11 = java.util.Arrays.binarySearch(r10, r1, r11, r4)
            if (r11 >= 0) goto L61
            int r11 = r11 + 1
            int r11 = -r11
            int r11 = r11 - r6
        L61:
            if (r11 < 0) goto L6a
            int r6 = r10.length
            int r6 = r6 / r5
            int r6 = r6 + r11
            r5 = r10[r6]
            if (r4 <= r5) goto L6c
        L6a:
            if (r8 == 0) goto L89
        L6c:
            if (r0 != 0) goto L77
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r4 = r12.length()
            r0.<init>(r4)
        L77:
            r0.append(r12, r3, r2)
            if (r8 == 0) goto L80
            r9 = 65533(0xfffd, float:9.1831E-41)
            goto L83
        L80:
            if (r9 >= 0) goto L83
            r9 = r1
        L83:
            if (r9 == 0) goto L88
            r0.appendCodePoint(r9)
        L88:
            r3 = r7
        L89:
            r2 = r7
            goto L4
        L8c:
            if (r0 == 0) goto L95
            r0.append(r12, r3, r2)
            java.lang.String r12 = r0.toString()
        L95:
            r0 = r1
        L96:
            int r2 = r12.length()
            if (r1 >= r2) goto Lca
            char r2 = r12.charAt(r1)
            int r3 = r1 + 1
            char r4 = (char) r2
            boolean r7 = java.lang.Character.isHighSurrogate(r4)
            if (r7 == 0) goto Lb4
            char r2 = r12.charAt(r3)
            int r2 = java.lang.Character.toCodePoint(r4, r2)
            int r1 = r1 + 2
            goto Lb5
        Lb4:
            r1 = r3
        Lb5:
            byte r2 = java.lang.Character.getDirectionality(r2)
            if (r2 == r6) goto Lc8
            if (r2 == r5) goto Lc8
            if (r2 != 0) goto L96
            if (r0 == 0) goto Lca
            java.lang.String r0 = "\u200e"
            java.lang.String r12 = r0.concat(r12)
            return r12
        Lc8:
            r0 = r6
            goto L96
        Lca:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehi.a(java.lang.String):java.lang.String");
    }
}
