package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class etk {
    public final ArrayList a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 != iArr[i4]) {
                    i4++;
                }
            }
        }
    }

    public final void a(itk itkVar) {
        this.a.add(itkVar);
    }

    public final List c(ArrayList arrayList) {
        igk igkVar;
        igk igkVar2;
        igk igkVar3;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.a;
        if (size != arrayList2.size()) {
            return null;
        }
        int size2 = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        b(arrayList3, size2, new int[size2], 0);
        itk[] itkVarArr = new itk[arrayList.size()];
        int size3 = arrayList3.size();
        int i = 0;
        while (i < size3) {
            Object obj = arrayList3.get(i);
            i++;
            int[] iArr = (int[]) obj;
            boolean z = true;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (iArr[i2] < arrayList.size()) {
                    itk itkVar = (itk) arrayList2.get(i2);
                    itk itkVar2 = (itk) arrayList.get(iArr[i2]);
                    itkVar.getClass();
                    z &= itkVar2.b.a <= itkVar.b.a && itkVar2.a == itkVar.a && ((igkVar = itkVar.c) == (igkVar2 = igk.DEFAULT) || (igkVar3 = itkVar2.c) == igkVar2 || igkVar3 == igkVar);
                    if (!z) {
                        break;
                    }
                    itkVarArr[iArr[i2]] = (itk) arrayList2.get(i2);
                }
            }
            if (z) {
                return Arrays.asList(itkVarArr);
            }
        }
        return null;
    }
}
