package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class xkc extends zkc {
    public final alc c;
    public final okc d;
    public final i16 e;
    public final igi f;
    public kmc g;

    public xkc(alc alcVar, okc okcVar, pkc pkcVar, noc nocVar) {
        super(alcVar.b);
        this.c = alcVar;
        this.d = okcVar;
        final byte b = 0;
        this.e = new i16(alcVar.e, new Function0(this) { // from class: wkc
            public final /* synthetic */ xkc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                xkc xkcVar = this.b;
                switch (b2) {
                }
                return xkcVar.g;
            }
        }, (byte) 2);
        final byte b2 = 1;
        this.f = new igi(alcVar.d, new Function0(this) { // from class: wkc
            public final /* synthetic */ xkc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                xkc xkcVar = this.b;
                switch (b22) {
                }
                return xkcVar.g;
            }
        }, pkcVar, nocVar);
        ConstraintLayout constraintLayout = alcVar.c;
        constraintLayout.setOnClickListener(new sma(this, (byte) 11));
        constraintLayout.setOnLongClickListener(new zt(this, (byte) 7));
    }

    @Override // defpackage.zkc
    public final void U() {
        igi.r0((y83) this.f.b, false);
    }

    @Override // defpackage.zkc
    public final void V() {
        this.f.a0();
    }
}
