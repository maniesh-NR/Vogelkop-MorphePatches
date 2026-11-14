package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.opera.android.privacy_monitor.views.PrivacyMonitorTopSheetLayout;

/* loaded from: classes.dex */
public final class rzg extends zp1 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    public rzg(Context context) {
        super(context, 2132084396);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rzg(qvl qvlVar, Context context, b2l b2lVar) {
        this(context);
        this.g = (byte) 1;
        this.h = qvlVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rzg(xzg xzgVar, Context context) {
        this(context);
        this.g = (byte) 0;
        this.h = xzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dismiss() {
        if (!isShowing()) {
            super.dismiss();
        } else {
            findViewById(2131362526).animate().setDuration(200L).setInterpolator(vgb.a).translationY(-r0.getHeight()).withEndAction(new ssi(this, (byte) 14)).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        View viewFindViewById = findViewById(2131362526);
        viewFindViewById.setOnClickListener(new h4i((Object) this, (byte) 25));
        viewFindViewById.setFocusable(false);
        getWindow().setGravity(48);
        getWindow().setLayout(-1, -1);
        setCanceledOnTouchOutside(true);
        getWindow().addFlags(-2013265920);
        getWindow().clearFlags(67108864);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        getWindow().setAttributes(attributes);
        svk svkVar = new svk(this, (byte) 7);
        dll dllVarS = q9n.s(viewFindViewById);
        if (dllVarS != null) {
            u8n.b(dllVarS, viewFindViewById, svkVar);
        }
        svkVar.a(viewFindViewById);
        View viewFindViewById2 = findViewById(2131362526);
        viewFindViewById2.setVisibility(4);
        viewFindViewById2.addOnLayoutChangeListener(new n5l(this, viewFindViewById2, (byte) 1));
    }

    public final void g() {
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                xzg xzgVar = (xzg) obj;
                super.onCreate(bundle);
                View viewInflate = getLayoutInflater().inflate(2131559247, (ViewGroup) null, false);
                int i = 2131362409;
                View viewJ = w1h.j(2131362409, viewInflate);
                if (viewJ != null) {
                    ei eiVarA = ei.a(viewJ);
                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                    PrivacyMonitorTopSheetLayout privacyMonitorTopSheetLayout = (PrivacyMonitorTopSheetLayout) w1h.j(2131364815, viewInflate);
                    if (privacyMonitorTopSheetLayout != null) {
                        xzgVar.g = privacyMonitorTopSheetLayout;
                        xzgVar.h = eiVarA;
                        setContentView(frameLayout);
                        xzgVar.i0();
                        break;
                    } else {
                        i = 2131364815;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                break;
            default:
                super.onCreate(bundle);
                setContentView(2131559175);
                qvl qvlVar = (qvl) obj;
                qvlVar.a.j((ViewStub) findViewById(2131362414), qvlVar);
                break;
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        f();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        f();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        f();
    }
}
