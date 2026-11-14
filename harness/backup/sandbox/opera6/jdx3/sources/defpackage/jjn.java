package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class jjn implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ojn b;

    public /* synthetic */ jjn(ojn ojnVar, byte b) {
        this.a = b;
        this.b = ojnVar;
    }

    public final Object get() {
        byte b = this.a;
        ojn ojnVar = this.b;
        switch (b) {
            case 0:
                return ojnVar.a;
            default:
                return new rb(ojnVar.a, ojnVar.b, (byte) 3);
        }
    }
}
