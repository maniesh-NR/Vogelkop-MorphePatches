package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class jdc implements lcc {
    public final /* synthetic */ e1i a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ e1i c;
    public final /* synthetic */ f1i d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;

    public jdc(e1i e1iVar, Function0 function0, e1i e1iVar2, f1i f1iVar, Function0 function02, Function0 function03) {
        this.a = e1iVar;
        this.b = function0;
        this.c = e1iVar2;
        this.d = f1iVar;
        this.e = function02;
        this.f = function03;
    }

    public final void onCreate() {
        e1i e1iVar = this.a;
        if (e1iVar != null) {
            e1iVar.invoke();
        }
    }

    public final void onDestroy() {
        this.f.invoke();
    }

    public final void onPause() {
        f1i f1iVar = this.d;
        if (f1iVar != null) {
            f1iVar.invoke();
        }
    }

    public final void onResume() {
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            e1iVar.invoke();
        }
    }

    public final void onStart() {
        this.b.invoke();
    }

    public final void onStop() {
        this.e.invoke();
    }
}
