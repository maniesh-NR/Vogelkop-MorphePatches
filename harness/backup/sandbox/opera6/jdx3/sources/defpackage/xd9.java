package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class xd9 implements qwl {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ le9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ vk2 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xd9(long j, oi2 oi2Var, vk2 vk2Var, le9 le9Var, String str) {
        this.b = le9Var;
        this.d = j;
        this.c = str;
        this.f = oi2Var;
        this.e = vk2Var;
    }

    public /* synthetic */ xd9(long j, vk2 vk2Var, le9 le9Var, re9 re9Var, String str) {
        this.b = le9Var;
        this.c = str;
        this.d = j;
        this.f = re9Var;
        this.e = vk2Var;
    }

    @Override // defpackage.qwl
    public final ih4 run() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                le9 le9Var = this.b;
                le9Var.getClass();
                return new ge9(this.d, (oi2) obj, this.e, le9Var, this.c);
            default:
                return new fe9(this.d, this.e, this.b, (re9) obj, this.c);
        }
    }
}
