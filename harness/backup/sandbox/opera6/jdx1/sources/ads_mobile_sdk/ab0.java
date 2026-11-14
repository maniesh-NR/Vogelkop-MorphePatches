package ads_mobile_sdk;

import defpackage.tso;

/* loaded from: classes.dex */
public final class ab0 implements tso {
    public final /* synthetic */ sb0 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ ab0(sb0 sb0Var, byte b) {
        this.b = b;
        this.a = sb0Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.b;
        byte b2 = 2;
        byte b3 = 1;
        byte b4 = 0;
        sb0 sb0Var = this.a;
        switch (b) {
            case 0:
                return new o6(sb0Var.c);
            case 1:
                return new ie0(sb0Var.c, b2);
            case 2:
                return new af0(sb0Var.c, b2);
            case 3:
                return new fd0(sb0Var.c);
            case 4:
                return new hd0(sb0Var.c);
            case 5:
                return new nc0(sb0Var.c);
            case 6:
                return new ue0(sb0Var.c, b3);
            case 7:
                return new rc0(sb0Var.c);
            case 8:
                return new ie0(sb0Var.c, b4);
            case 9:
                return new vc0(sb0Var.c);
            case 10:
                return new af0(sb0Var.c, b4);
            case 11:
                return new ie0(sb0Var.c, b3);
            case 12:
                return new af0(sb0Var.c, b3);
            case 13:
                return new jc0(sb0Var.c);
            case 14:
                return new ee0(sb0Var.c, (byte) 2);
            case 15:
                return new be0(sb0Var.c);
            case 16:
                return new ee0(sb0Var.c, (byte) 0);
            case 17:
                return new ee0(sb0Var.c, (byte) 1);
            case 18:
                sb0 sb0Var2 = sb0Var.c;
                return new bw2();
            case 19:
                return new bc0(sb0Var.c);
            case 20:
                return new ha6(sb0Var.c);
            case 21:
                return new fc0(sb0Var.c);
            case 22:
                return new u02(sb0Var.c);
            case 23:
                return new dd0(sb0Var.c);
            case 24:
                return new dd0(sb0Var.c);
            case 25:
                return new u02(sb0Var.c);
            case 26:
                return new u02(sb0Var.c);
            case 27:
                return new z90(sb0Var.c);
            default:
                return new ue0(sb0Var.c, b4);
        }
    }
}
