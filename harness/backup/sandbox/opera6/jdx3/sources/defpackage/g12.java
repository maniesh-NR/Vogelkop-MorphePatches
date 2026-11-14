package defpackage;

import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class g12 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i12 b;

    public /* synthetic */ g12(i12 i12Var, byte b) {
        this.a = b;
        this.b = i12Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = 0;
        i12 i12Var = this.b;
        switch (b) {
            case 0:
                i12Var.c.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                File[] fileArrListFiles = ((File) i12Var.e.getValue()).listFiles();
                if (fileArrListFiles != null) {
                    ArrayList arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        if (file.isFile()) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        on7 on7Var = pn7.b;
                        if (pn7.p(cs5.y0(jCurrentTimeMillis - ((File) obj2).lastModified(), un7.d), un7.h) >= 7) {
                            arrayList2.add(obj2);
                        }
                    }
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj3 = arrayList2.get(i);
                        i++;
                        ((File) obj3).delete();
                    }
                    break;
                }
                break;
            default:
                File[] fileArrListFiles2 = ((File) i12Var.e.getValue()).listFiles();
                if (fileArrListFiles2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        if (file2.isFile()) {
                            arrayList3.add(file2);
                        }
                    }
                    int size3 = arrayList3.size();
                    while (i < size3) {
                        Object obj4 = arrayList3.get(i);
                        i++;
                        ((File) obj4).delete();
                    }
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
