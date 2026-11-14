package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.CreditCard;

/* loaded from: classes.dex */
public final class yw extends dt1 {
    public final Object e;

    public yw(ole oleVar) {
        this.e = oleVar;
        J(CreditCard.class, new va2(this, (byte) 29), new t14((byte) 18), new a3j((byte) 4));
    }

    public yw(wth wthVar, boolean z) {
        this.e = wthVar;
        J(Address.class, new vw((byte) 0, (Object) this, z), new mc8((byte) 29), new a3j((byte) 4));
    }

    public yw(z4k z4kVar, esk eskVar) {
        this.e = z4kVar;
        final byte b = 0;
        setHasStableIds(false);
        byte b2 = 4;
        J(sqn.class, new sjn((byte) 11), new xjj(this) { // from class: nqn
            public final /* synthetic */ yw b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void i(Object obj, i iVar) {
                byte b3 = b;
                final yw ywVar = this.b;
                switch (b3) {
                    case 0:
                        ((b98) ((xqn) iVar).b.c).b.setOnClickListener(new obn(ywVar, (sqn) obj, (byte) 10));
                        break;
                    default:
                        final qqn qqnVar = (qqn) obj;
                        pqn pqnVar = (pqn) iVar;
                        final byte b4 = 0;
                        ((b98) pqnVar.b.c).b.setOnClickListener(new View.OnClickListener() { // from class: oqn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b5 = b4;
                                qqn qqnVar2 = qqnVar;
                                yw ywVar2 = ywVar;
                                switch (b5) {
                                    case 0:
                                        ((mrn) ((z4k) ywVar2.e).b).p.f(new grn(qqnVar2.a));
                                        break;
                                    default:
                                        ((mrn) ((z4k) ywVar2.e).b).p.f(new hrn(qqnVar2.a));
                                        break;
                                }
                            }
                        });
                        final byte b5 = 1;
                        ((FrameLayout) pqnVar.b.d).setOnClickListener(new View.OnClickListener() { // from class: oqn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b52 = b5;
                                qqn qqnVar2 = qqnVar;
                                yw ywVar2 = ywVar;
                                switch (b52) {
                                    case 0:
                                        ((mrn) ((z4k) ywVar2.e).b).p.f(new grn(qqnVar2.a));
                                        break;
                                    default:
                                        ((mrn) ((z4k) ywVar2.e).b).p.f(new hrn(qqnVar2.a));
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }, new a3j(b2));
        J(rqn.class, new roj(this, eskVar, (byte) 17), new sjn((byte) 12), new a3j(b2));
        final byte b3 = 1;
        J(qqn.class, new sjn((byte) 13), new xjj(this) { // from class: nqn
            public final /* synthetic */ yw b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void i(Object obj, i iVar) {
                byte b32 = b3;
                final yw ywVar = this.b;
                switch (b32) {
                    case 0:
                        ((b98) ((xqn) iVar).b.c).b.setOnClickListener(new obn(ywVar, (sqn) obj, (byte) 10));
                        break;
                    default:
                        final qqn qqnVar = (qqn) obj;
                        pqn pqnVar = (pqn) iVar;
                        final byte b4 = 0;
                        ((b98) pqnVar.b.c).b.setOnClickListener(new View.OnClickListener() { // from class: oqn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b52 = b4;
                                qqn qqnVar2 = qqnVar;
                                yw ywVar2 = ywVar;
                                switch (b52) {
                                    case 0:
                                        ((mrn) ((z4k) ywVar2.e).b).p.f(new grn(qqnVar2.a));
                                        break;
                                    default:
                                        ((mrn) ((z4k) ywVar2.e).b).p.f(new hrn(qqnVar2.a));
                                        break;
                                }
                            }
                        });
                        final byte b5 = 1;
                        ((FrameLayout) pqnVar.b.d).setOnClickListener(new View.OnClickListener() { // from class: oqn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b52 = b5;
                                qqn qqnVar2 = qqnVar;
                                yw ywVar2 = ywVar;
                                switch (b52) {
                                    case 0:
                                        ((mrn) ((z4k) ywVar2.e).b).p.f(new grn(qqnVar2.a));
                                        break;
                                    default:
                                        ((mrn) ((z4k) ywVar2.e).b).p.f(new hrn(qqnVar2.a));
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }, new a3j(b2));
    }
}
