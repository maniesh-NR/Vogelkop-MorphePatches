package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ia4 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ja4 b;

    public /* synthetic */ ia4(ja4 ja4Var, byte b) {
        this.a = b;
        this.b = ja4Var;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        ja4 ja4Var = this.b;
        switch (b) {
            case 0:
                try {
                    try {
                        Trace.beginSection(((Object) sd4.b(ja4Var.a)) + "#availableCaptureRequestKeys");
                        Set setN0 = Build.VERSION.SDK_INT >= 33 ? CollectionsKt.n0(t8.n(ja4Var.c, ja4Var.b)) : v08.a;
                        if (setN0 == null) {
                            setN0 = v08.a;
                        }
                        Trace.endSection();
                        return setN0;
                    } finally {
                    }
                } catch (Throwable unused) {
                    return v08.a;
                }
            case 1:
                try {
                    try {
                        Trace.beginSection(((Object) sd4.b(ja4Var.a)) + "#availableCaptureResultKeys");
                        Set setN02 = Build.VERSION.SDK_INT >= 33 ? CollectionsKt.n0(t8.o(ja4Var.c, ja4Var.b)) : v08.a;
                        if (setN02 == null) {
                            setN02 = v08.a;
                        }
                        Trace.endSection();
                        return setN02;
                    } finally {
                    }
                } catch (Throwable unused2) {
                    return v08.a;
                }
            case 2:
                try {
                    try {
                        Trace.beginSection(((Object) sd4.b(ja4Var.a)) + "#isPostviewSupported");
                        boolean zA = Build.VERSION.SDK_INT >= 34 ? g8.A(ja4Var.c, ja4Var.b) : false;
                        Trace.endSection();
                        z = zA;
                    } finally {
                    }
                } catch (Throwable unused3) {
                }
                return Boolean.valueOf(z);
            default:
                try {
                    try {
                        Trace.beginSection(((Object) sd4.b(ja4Var.a)) + "#isCaptureProgressSupported");
                        boolean z2 = Build.VERSION.SDK_INT >= 34 ? g8.z(ja4Var.c, ja4Var.b) : false;
                        Trace.endSection();
                        z = z2;
                    } finally {
                    }
                } catch (Throwable unused4) {
                }
                return Boolean.valueOf(z);
        }
    }
}
