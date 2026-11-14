package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class joj implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ivg b;

    public /* synthetic */ joj(ivg ivgVar, byte b) {
        this.a = b;
        this.b = ivgVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = 0;
        ivg ivgVar = this.b;
        switch (b) {
            case 0:
                return ivgVar.y().listFiles();
            case 1:
                File[] fileArrListFiles = ivgVar.y().listFiles();
                if (fileArrListFiles == null) {
                    return null;
                }
                int length = fileArrListFiles.length;
                while (i < length) {
                    fileArrListFiles[i].delete();
                    i++;
                }
                return Unit.a;
            default:
                File[] fileArrListFiles2 = ivgVar.y().listFiles();
                long length2 = 0;
                if (fileArrListFiles2 != null) {
                    int length3 = fileArrListFiles2.length;
                    while (i < length3) {
                        length2 += fileArrListFiles2[i].length();
                        i++;
                    }
                }
                return Long.valueOf(length2);
        }
    }
}
