package defpackage;

import J.N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldqi;", "Llj;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class dqi extends lj {
    public wk9 r;
    public final zyk s;

    public dqi() {
        super(0, 0);
        this.s = z4c.b(new yse(this, (byte) 11));
    }

    public final void G0(vs vsVar, eqi eqiVar) {
        TextView textView = (TextView) vsVar.c;
        String str = eqiVar.a;
        if (str == null) {
            str = "-";
        }
        textView.setText(str);
        TextView textView2 = (TextView) vsVar.d;
        String str2 = eqiVar.b;
        textView2.setText(str2 != null ? str2 : "-");
        vsVar.b.setOnLongClickListener(new zt(this, eqiVar));
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        LinkedHashMap linkedHashMap;
        Set<String> setKeySet;
        super.onCreate(bundle);
        gqi gqiVar = (gqi) this.s.getValue();
        Bundle arguments = getArguments();
        gqiVar.getClass();
        if (arguments == null || (setKeySet = arguments.keySet()) == null) {
            linkedHashMap = null;
        } else {
            Set<String> set = setKeySet;
            int iA = qbd.a(k95.o(set, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : set) {
                linkedHashMap.put(obj, arguments.getString((String) obj, ""));
            }
        }
        if (linkedHashMap == null) {
            linkedHashMap = n08.a;
        }
        if (!linkedHashMap.isEmpty()) {
            pqi pqiVar = gqiVar.d;
            pqiVar.getClass();
            mqi[] mqiVarArr = mqi.a;
            boolean zA = Intrinsics.a(linkedHashMap.get("lf"), "1");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                mqi[] mqiVarArr2 = mqi.a;
                if (!Intrinsics.a(str, "lf")) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            if (N.MphJ2uhp()) {
                pqiVar.c(linkedHashMap2, zA);
            }
        }
        sqi sqiVar = gqiVar.c;
        new zg(sqiVar.a, sqiVar.h, sqiVar.m, new f23(new tji(gqiVar, (byte) 4), sqiVar, l08.a, (byte) 13));
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.r = null;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((OperaMaterialButton) this.r.s).setOnClickListener(new h4i(this, (byte) 3));
        xf8.i0(((gqi) this.s.getValue()).e, getViewLifecycleOwner(), this.r.b, (List) null, new qzg(this, (byte) 5));
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.l.D("SDx");
        View viewInflate = layoutInflater.inflate(2131558900, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131361806;
        View viewJ = w1h.j(2131361806, viewInflate);
        if (viewJ != null) {
            vs vsVarA = vs.a(viewJ);
            i = 2131361949;
            View viewJ2 = w1h.j(2131361949, viewInflate);
            if (viewJ2 != null) {
                vs vsVarA2 = vs.a(viewJ2);
                i = 2131362052;
                View viewJ3 = w1h.j(2131362052, viewInflate);
                if (viewJ3 != null) {
                    vs vsVarA3 = vs.a(viewJ3);
                    i = 2131362129;
                    View viewJ4 = w1h.j(2131362129, viewInflate);
                    if (viewJ4 != null) {
                        vs vsVarA4 = vs.a(viewJ4);
                        i = 2131362200;
                        View viewJ5 = w1h.j(2131362200, viewInflate);
                        if (viewJ5 != null) {
                            vs vsVarA5 = vs.a(viewJ5);
                            i = 2131362394;
                            View viewJ6 = w1h.j(2131362394, viewInflate);
                            if (viewJ6 != null) {
                                vs vsVarA6 = vs.a(viewJ6);
                                i = 2131362460;
                                View viewJ7 = w1h.j(2131362460, viewInflate);
                                if (viewJ7 != null) {
                                    vs vsVarA7 = vs.a(viewJ7);
                                    i = 2131363140;
                                    View viewJ8 = w1h.j(2131363140, viewInflate);
                                    if (viewJ8 != null) {
                                        vs vsVarA8 = vs.a(viewJ8);
                                        i = 2131363156;
                                        View viewJ9 = w1h.j(2131363156, viewInflate);
                                        if (viewJ9 != null) {
                                            vs vsVarA9 = vs.a(viewJ9);
                                            i = 2131363302;
                                            View viewJ10 = w1h.j(2131363302, viewInflate);
                                            if (viewJ10 != null) {
                                                vs vsVarA10 = vs.a(viewJ10);
                                                i = 2131363310;
                                                View viewJ11 = w1h.j(2131363310, viewInflate);
                                                if (viewJ11 != null) {
                                                    vs vsVarA11 = vs.a(viewJ11);
                                                    i = 2131363322;
                                                    TextView textView = (TextView) w1h.j(2131363322, viewInflate);
                                                    if (textView != null) {
                                                        i = 2131363901;
                                                        View viewJ12 = w1h.j(2131363901, viewInflate);
                                                        if (viewJ12 != null) {
                                                            vs vsVarA12 = vs.a(viewJ12);
                                                            i = 2131364038;
                                                            View viewJ13 = w1h.j(2131364038, viewInflate);
                                                            if (viewJ13 != null) {
                                                                vs vsVarA13 = vs.a(viewJ13);
                                                                i = 2131364039;
                                                                View viewJ14 = w1h.j(2131364039, viewInflate);
                                                                if (viewJ14 != null) {
                                                                    vs vsVarA14 = vs.a(viewJ14);
                                                                    i = 2131364049;
                                                                    View viewJ15 = w1h.j(2131364049, viewInflate);
                                                                    if (viewJ15 != null) {
                                                                        vs vsVarA15 = vs.a(viewJ15);
                                                                        i = 2131364056;
                                                                        OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131364056, viewInflate);
                                                                        if (operaMaterialButton != null) {
                                                                            i = 2131364977;
                                                                            View viewJ16 = w1h.j(2131364977, viewInflate);
                                                                            if (viewJ16 != null) {
                                                                                vs vsVarA16 = vs.a(viewJ16);
                                                                                i = 2131364982;
                                                                                View viewJ17 = w1h.j(2131364982, viewInflate);
                                                                                if (viewJ17 != null) {
                                                                                    vs vsVarA17 = vs.a(viewJ17);
                                                                                    i = 2131364983;
                                                                                    View viewJ18 = w1h.j(2131364983, viewInflate);
                                                                                    if (viewJ18 != null) {
                                                                                        this.r = new wk9((LinearLayout) viewInflate, vsVarA, vsVarA2, vsVarA3, vsVarA4, vsVarA5, vsVarA6, vsVarA7, vsVarA8, vsVarA9, vsVarA10, vsVarA11, textView, vsVarA12, vsVarA13, vsVarA14, vsVarA15, operaMaterialButton, vsVarA16, vsVarA17, vs.a(viewJ18));
                                                                                        ((TextView) vsVarA4.e).setText("Base url");
                                                                                        ((TextView) ((vs) this.r.j).e).setText("Country code");
                                                                                        ((TextView) ((vs) this.r.l).e).setText("Language code");
                                                                                        ((TextView) ((vs) this.r.o).e).setText("Platform name");
                                                                                        ((TextView) ((vs) this.r.m).e).setText("Operator");
                                                                                        ((TextView) ((vs) this.r.g).e).setText("Brand name");
                                                                                        ((TextView) ((vs) this.r.d).e).setText("Advertising id");
                                                                                        ((TextView) ((vs) this.r.k).e).setText("Hashed opera user id");
                                                                                        ((TextView) ((vs) this.r.t).e).setText("User consent");
                                                                                        ((TextView) ((vs) this.r.r).e).setText("Removed speed dials");
                                                                                        ((TextView) ((vs) this.r.v).e).setText("Number of user defined speed dials");
                                                                                        ((TextView) ((vs) this.r.h).e).setText("Config bundle");
                                                                                        ((TextView) ((vs) this.r.q).e).setText("Referrer source");
                                                                                        ((TextView) ((vs) this.r.e).e).setText("App version");
                                                                                        ((TextView) ((vs) this.r.p).e).setText("Referrer campaign");
                                                                                        ((TextView) ((vs) this.r.u).e).setText("User plan");
                                                                                        ((TextView) ((vs) this.r.c).e).setText("A/B Group");
                                                                                        ((TextView) ((vs) this.r.i).e).setText("Crypto wallet enabled");
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
