package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xc6 extends e1g {
    public final /* synthetic */ byte e;
    public final l08 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc6(byte b) {
        super(21000);
        this.e = b;
        switch (b) {
            case 1:
                d9j[] d9jVarArr = d9j.a;
                super(19000);
                this.f = l08.a;
                break;
            case 2:
                d9j[] d9jVarArr2 = d9j.a;
                super(20000);
                this.f = l08.a;
                break;
            case 3:
                d9j[] d9jVarArr3 = d9j.a;
                super(18000);
                this.f = l08.a;
                break;
            case 4:
                d9j[] d9jVarArr4 = d9j.a;
                super(49000);
                this.f = l08.a;
                break;
            default:
                d9j[] d9jVarArr5 = d9j.a;
                this.f = l08.a;
                break;
        }
    }

    @Override // defpackage.v6j
    public final List d() {
        switch (this.e) {
        }
        return this.f;
    }

    @Override // defpackage.e1g
    public final r6j g(int i) {
        switch (this.e) {
            case 0:
                return new r6j(i, new x6j(wc6.class, new ah5((byte) 25)), 2132021182, 2132021178, 2131232059, true, (Function1) new tb6((byte) 2), 64);
            case 1:
                return new r6j(i, new x6j(d8j.class, new nf8((byte) 1)), 2132021213, 2132021214, 2131232067, false, (Function1) new d58((byte) 15), 96);
            case 2:
                return new r6j(i, new x6j(d8j.class, new nf8((byte) 6)), 2132021224, 2132021225, 2131232105, true, (Function1) new q9a((byte) 1), 64);
            case 3:
                return new r6j(i, new x6j(d8j.class, new nf8((byte) 22)), 2132021553, 2132021309, 2131232158, false, (Function1) new zbe((byte) 16), 96);
            default:
                return new r6j(i, new x6j(d8j.class, new rag((byte) 21)), 2132021553, 2132020090, 2131232158, false, (Function1) new u4h((byte) 5), 96);
        }
    }
}
