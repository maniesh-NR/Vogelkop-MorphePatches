package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import java.util.List;

/* loaded from: classes.dex */
public final class dq extends dej {
    public final mq c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;

    public dq(mej mejVar, mq mqVar, String str, String str2, String str3, List list) {
        super(mejVar);
        this.c = mqVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = list;
    }

    @Override // defpackage.dej
    public final View a(Context context) {
        final byte b = 0;
        View viewInflate = LayoutInflater.from(context).inflate(2131558437, (ViewGroup) null, false);
        int i = 2131361808;
        yq1 yq1Var = (StylingTextView) w1h.j(2131361808, viewInflate);
        if (yq1Var != null) {
            i = 2131362728;
            yq1 yq1Var2 = (StylingTextView) w1h.j(2131362728, viewInflate);
            if (yq1Var2 != null) {
                i = 2131363109;
                yq1 yq1Var3 = (StylingTextView) w1h.j(2131363109, viewInflate);
                if (yq1Var3 != null) {
                    i = 2131362594;
                    AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, viewInflate);
                    if (appCompatImageView != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        final byte b2 = 1;
                        String str = this.f;
                        if (str == null || str.length() == 0) {
                            appCompatImageView.setVisibility(8);
                        } else {
                            dwh dwhVarI = yne.b.i(str);
                            dwhVarI.d = true;
                            dwhVarI.g(appCompatImageView, (d94) null);
                        }
                        yq1Var2.setText(this.d);
                        yq1Var.setOnClickListener(new View.OnClickListener(this) { // from class: bq
                            public final /* synthetic */ dq b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b3 = b;
                                dq dqVar = this.b;
                                switch (b3) {
                                    case 0:
                                        vx3 vx3VarA = ay3.a(dqVar.e, lqm.d, false);
                                        vx3VarA.c(true);
                                        ac8.a(new ay3(vx3VarA));
                                        dqVar.b();
                                        break;
                                    default:
                                        Context context2 = view.getContext();
                                        mq mqVar = dqVar.c;
                                        List list = dqVar.g;
                                        nej nejVarF = a4h.f(context2);
                                        cp cpVar = new cp(mqVar, 2132017311, list);
                                        nejVarF.getClass();
                                        nejVarF.b(cpVar, ijm.b);
                                        dqVar.b();
                                        break;
                                }
                            }
                        });
                        if (this.g.isEmpty()) {
                            yq1Var3.setVisibility(8);
                            return linearLayout;
                        }
                        yq1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: bq
                            public final /* synthetic */ dq b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b3 = b2;
                                dq dqVar = this.b;
                                switch (b3) {
                                    case 0:
                                        vx3 vx3VarA = ay3.a(dqVar.e, lqm.d, false);
                                        vx3VarA.c(true);
                                        ac8.a(new ay3(vx3VarA));
                                        dqVar.b();
                                        break;
                                    default:
                                        Context context2 = view.getContext();
                                        mq mqVar = dqVar.c;
                                        List list = dqVar.g;
                                        nej nejVarF = a4h.f(context2);
                                        cp cpVar = new cp(mqVar, 2132017311, list);
                                        nejVarF.getClass();
                                        nejVarF.b(cpVar, ijm.b);
                                        dqVar.b();
                                        break;
                                }
                            }
                        });
                        return linearLayout;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
