package defpackage;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import com.opera.android.startpage.SoftwareClipMaxWidthLinearLayout;

/* loaded from: classes.dex */
public abstract class m6k extends ab2 implements ev8 {
    public final kf d;
    public final tsd e;

    public m6k(kf kfVar, tsd tsdVar, tsd tsdVar2) {
        super((FrameLayout) kfVar.b);
        this.d = kfVar;
        this.e = tsdVar;
        SoftwareClipMaxWidthLinearLayout softwareClipMaxWidthLinearLayout = (SoftwareClipMaxWidthLinearLayout) kfVar.c;
        final byte b = 1;
        softwareClipMaxWidthLinearLayout.setClipToOutline(true);
        int i = d03.e;
        ydp.q(softwareClipMaxWidthLinearLayout, j14.i0(2131233190, softwareClipMaxWidthLinearLayout.getContext()));
        kkf kkfVar = new kkf(this, (byte) 21);
        dll dllVarS = q9n.s(softwareClipMaxWidthLinearLayout);
        if (dllVarS != null) {
            u8n.b(dllVarS, softwareClipMaxWidthLinearLayout, kkfVar);
        }
        final byte b2 = 0;
        a26.T(tsdVar, this.c, new f7f(this) { // from class: l6k
            public final /* synthetic */ m6k b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                m6k m6kVar = this.b;
                switch (b3) {
                    case 0:
                        SoftwareClipMaxWidthLinearLayout softwareClipMaxWidthLinearLayout2 = (SoftwareClipMaxWidthLinearLayout) m6kVar.d.c;
                        softwareClipMaxWidthLinearLayout2.setBackgroundTintList(ColorStateList.valueOf(((v8k) m6kVar.e.g()).d(softwareClipMaxWidthLinearLayout2.getContext())));
                        break;
                    default:
                        l5k l5kVar = (l5k) obj;
                        kf kfVar2 = m6kVar.d;
                        FrameLayout frameLayout = (FrameLayout) kfVar2.b;
                        frameLayout.setPadding(l5kVar.a, frameLayout.getPaddingTop(), l5kVar.a, frameLayout.getPaddingBottom());
                        p37.t0(l5kVar.b, (SoftwareClipMaxWidthLinearLayout) kfVar2.c);
                        break;
                }
            }
        });
        a26.T(tsdVar2, this.c, new f7f(this) { // from class: l6k
            public final /* synthetic */ m6k b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                m6k m6kVar = this.b;
                switch (b3) {
                    case 0:
                        SoftwareClipMaxWidthLinearLayout softwareClipMaxWidthLinearLayout2 = (SoftwareClipMaxWidthLinearLayout) m6kVar.d.c;
                        softwareClipMaxWidthLinearLayout2.setBackgroundTintList(ColorStateList.valueOf(((v8k) m6kVar.e.g()).d(softwareClipMaxWidthLinearLayout2.getContext())));
                        break;
                    default:
                        l5k l5kVar = (l5k) obj;
                        kf kfVar2 = m6kVar.d;
                        FrameLayout frameLayout = (FrameLayout) kfVar2.b;
                        frameLayout.setPadding(l5kVar.a, frameLayout.getPaddingTop(), l5kVar.a, frameLayout.getPaddingBottom());
                        p37.t0(l5kVar.b, (SoftwareClipMaxWidthLinearLayout) kfVar2.c);
                        break;
                }
            }
        });
    }
}
