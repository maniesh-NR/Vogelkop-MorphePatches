package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class d1j implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f1j b;

    public /* synthetic */ d1j(f1j f1jVar, byte b) {
        this.a = b;
        this.b = f1jVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        this.b.c(((Boolean) obj).booleanValue());
    }
}
