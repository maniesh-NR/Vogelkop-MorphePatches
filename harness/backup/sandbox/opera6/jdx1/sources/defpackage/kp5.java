package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final /* synthetic */ class kp5 implements i6f, jr9, q5n, bcf, fjc {
    public final /* synthetic */ byte a;

    public /* synthetic */ kp5(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: x0 */
    public static /* synthetic */ void a(Object obj, Exception exc) throws x0 {
        throw new x0("IOException converting stream to byte array: " + obj, exc, (byte) 0);
    }

    public static /* synthetic */ void b(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: m37 */
    public static /* synthetic */ void c(String str) throws m37 {
        throw new m37(str);
    }

    public static /* synthetic */ void d(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // defpackage.jr9
    /* renamed from: apply */
    public final Object mo17apply(Object obj) {
        return null;
    }

    public final Object e() {
        switch (this.a) {
            case 0:
                return new ArrayList();
            case 1:
                return new LinkedHashSet();
            case 2:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    public final void invoke(Object obj) {
        e11 e11Var = (e11) obj;
        switch (this.a) {
            case 24:
                e11Var.getClass();
                break;
            case 25:
                e11Var.getClass();
                break;
            case 26:
                e11Var.getClass();
                break;
            case 27:
                e11Var.getClass();
                break;
            case 28:
                e11Var.getClass();
                break;
            default:
                e11Var.getClass();
                break;
        }
    }

    @Override // defpackage.bcf
    public final g3o l0(View view, g3o g3oVar) {
        switch (this.a) {
            case 19:
                r9b r9bVarI = g3oVar.a.i(519);
                view.setPadding(r9bVarI.a, r9bVarI.b, r9bVarI.c, r9bVarI.d);
                break;
            default:
                r9b r9bVarI2 = g3oVar.a.i(519);
                view.setPadding(r9bVarI2.a, r9bVarI2.b, r9bVarI2.c, r9bVarI2.d);
                break;
        }
        return g3oVar;
    }

    @Override // defpackage.q5n
    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return c37.r().l(1, keyEvent);
    }
}
