package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* loaded from: classes.dex */
public final /* synthetic */ class b32 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l32 b;

    public /* synthetic */ b32(l32 l32Var, byte b) {
        this.a = b;
        this.b = l32Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        l32 l32Var = this.b;
        switch (b) {
            case 0:
                File file = (File) l32Var.d.get();
                ehc ehcVarB = a.b();
                try {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            if (c.l(file2.getName(), ".data", false) && file2.canRead()) {
                                ebb ebbVar = ebb.c;
                                ehcVarB.add(new h32(file2, j06.m(file2.lastModified())));
                            }
                        }
                    }
                } catch (IOException unused) {
                }
                return a.a(ehcVarB);
            default:
                try {
                    File[] fileArrListFiles2 = ((File) l32Var.d.get()).listFiles();
                    if (fileArrListFiles2 == null) {
                        return null;
                    }
                    for (File file3 : fileArrListFiles2) {
                        if (c.l(file3.getName(), ".data", false)) {
                            file3.delete();
                        }
                    }
                    return Unit.a;
                } catch (IOException unused2) {
                    return Unit.a;
                }
        }
    }
}
