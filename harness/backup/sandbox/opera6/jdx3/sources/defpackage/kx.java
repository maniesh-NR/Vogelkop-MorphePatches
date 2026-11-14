package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.leanplum.messagetemplates.MessageTemplateConstants;

/* loaded from: classes.dex */
public final class kx implements ea2 {
    public final /* synthetic */ byte a = 0;
    public final kze b;
    public final Object c;

    public kx(kze kzeVar, izj izjVar) {
        this.b = kzeVar;
        this.c = izjVar;
    }

    public kx(x5f x5fVar, kze kzeVar) {
        this.c = x5fVar;
        this.b = kzeVar;
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        byte b = this.a;
        kze kzeVar = this.b;
        switch (b) {
            case 0:
                if (i == 2131558730) {
                    return new lx(ha2.M(viewGroup, i, 0), kzeVar, (izj) this.c);
                }
                return null;
            default:
                if (i == 2131558746 || i == 2131558751 || i == 2131558749) {
                    View viewM = ha2.M(viewGroup, i, 0);
                    h00 h00Var = new h00(viewM, new n00(), kzeVar);
                    h00Var.h0(new jsd(viewM.getContext()));
                    return h00Var;
                }
                if (i == 2131558753) {
                    return new i00(ha2.M(viewGroup, i, 2132084368), 350, 200, kzeVar);
                }
                if (i == 2131558734) {
                    return new i00(ha2.M(viewGroup, i, 2132084368), MessageTemplateConstants.Values.CENTER_POPUP_WIDTH, MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, kzeVar);
                }
                if (i == 2131558737) {
                    return new j00(ha2.M(viewGroup, i, 2132084368), true, kzeVar);
                }
                if (i == 2131558735 || i == 2131558736) {
                    return new j00(ha2.M(viewGroup, i, 2132084368), false, kzeVar);
                }
                if (i == 2131558739) {
                    return new k00(ha2.M(viewGroup, i, 2132084368), true, kzeVar);
                }
                if (i == 2131558738) {
                    return new k00(ha2.M(viewGroup, i, 2132084368), false, kzeVar);
                }
                if (i == 2131558750) {
                    return new a10(ha2.M(viewGroup, i, 2132084368), kzeVar);
                }
                if (i == 2131558752) {
                    return new e10(ha2.M(viewGroup, i, 2132084368), kzeVar);
                }
                if (i == 2131558747) {
                    return new y00(ha2.M(viewGroup, i, 2132084368), kzeVar);
                }
                if (i == 2131558755) {
                    return new mu8(ha2.M(viewGroup, 2131558755, 0));
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    @Override // defpackage.ea2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(defpackage.ja2 r11, int r12, defpackage.ca2 r13) {
        /*
            r10 = this;
            byte r12 = r10.a
            r0 = 0
            switch(r12) {
                case 0: goto La2;
                default: goto L6;
            }
        L6:
            byte r12 = r13.b
            boolean r13 = r13.a
            boolean r1 = r11 instanceof defpackage.x10
            if (r1 == 0) goto La1
            x10 r11 = (defpackage.x10) r11
            yz r11 = r11.d
            w10 r11 = (defpackage.w10) r11
            cie r0 = r11.u
            w06 r0 = r0.d
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L92
            r2 = 3
            if (r0 == r2) goto L8e
            r2 = 8
            if (r0 == r2) goto L8a
            switch(r0) {
                case 13: goto L7a;
                case 14: goto L70;
                case 15: goto L6c;
                default: goto L29;
            }
        L29:
            switch(r0) {
                case 19: goto L68;
                case 20: goto L68;
                case 21: goto L68;
                case 22: goto L60;
                case 23: goto L60;
                case 24: goto L60;
                case 25: goto L92;
                default: goto L2c;
            }
        L2c:
            uz r12 = r11.n
            dl r13 = r11.h()
            java.lang.Object r10 = r10.c
            r0 = r10
            x5f r0 = (defpackage.x5f) r0
            java.lang.String r1 = r11.g
            yo r10 = r11.i
            u50 r2 = defpackage.yo.h(r10)
            if (r13 == 0) goto L45
            q50 r10 = r13.b
        L43:
            r3 = r10
            goto L48
        L45:
            q50 r10 = defpackage.q50.f
            goto L43
        L48:
            if (r12 == 0) goto L4e
            java.lang.String r10 = r12.a
        L4c:
            r4 = r10
            goto L51
        L4e:
            java.lang.String r10 = ""
            goto L4c
        L51:
            v50 r8 = r11.e()
            r9 = 0
            r5 = 0
            r7 = 0
            r0.p(r1, r2, r3, r4, r5, r7, r8, r9)
            r0 = 2131558755(0x7f0d0163, float:1.8742835E38)
            goto La1
        L60:
            if (r12 > r1) goto L64
            if (r13 != 0) goto L9a
        L64:
            r0 = 2131558753(0x7f0d0161, float:1.874283E38)
            goto La1
        L68:
            r0 = 2131558752(0x7f0d0160, float:1.8742829E38)
            goto La1
        L6c:
            r0 = 2131558750(0x7f0d015e, float:1.8742825E38)
            goto La1
        L70:
            if (r13 == 0) goto L76
            r0 = 2131558739(0x7f0d0153, float:1.8742802E38)
            goto La1
        L76:
            r0 = 2131558738(0x7f0d0152, float:1.87428E38)
            goto La1
        L7a:
            if (r12 <= r1) goto L80
            r0 = 2131558736(0x7f0d0150, float:1.8742796E38)
            goto La1
        L80:
            if (r13 == 0) goto L86
            r0 = 2131558737(0x7f0d0151, float:1.8742798E38)
            goto La1
        L86:
            r0 = 2131558735(0x7f0d014f, float:1.8742794E38)
            goto La1
        L8a:
            r0 = 2131558747(0x7f0d015b, float:1.8742819E38)
            goto La1
        L8e:
            r0 = 2131558734(0x7f0d014e, float:1.8742792E38)
            goto La1
        L92:
            if (r12 <= r1) goto L98
            r0 = 2131558749(0x7f0d015d, float:1.8742823E38)
            goto La1
        L98:
            if (r13 == 0) goto L9e
        L9a:
            r0 = 2131558751(0x7f0d015f, float:1.8742827E38)
            goto La1
        L9e:
            r0 = 2131558746(0x7f0d015a, float:1.8742817E38)
        La1:
            return r0
        La2:
            boolean r10 = r11 instanceof defpackage.fo
            if (r10 == 0) goto La9
            r0 = 2131558730(0x7f0d014a, float:1.8742784E38)
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kx.q(ja2, int, ca2):int");
    }
}
