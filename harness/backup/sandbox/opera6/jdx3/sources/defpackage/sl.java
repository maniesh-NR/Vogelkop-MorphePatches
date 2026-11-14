package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.OperaPageRootView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class sl implements knf {
    public final pde a;
    public final shf b;
    public final String c;
    public final wy d;
    public final ei e;
    public final b59 f;

    /* JADX WARN: Multi-variable type inference failed */
    public sl(BrowserActivity browserActivity, pde pdeVar, String str) {
        this.a = pdeVar;
        this.c = str;
        View viewInflate = browserActivity.getLayoutInflater().inflate(2131558438, (ViewGroup) null, false);
        int i = 2131362409;
        ScrollView scrollView = (ScrollView) w1h.j(2131362409, viewInflate);
        if (scrollView != null) {
            i = 2131362414;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131362414, viewInflate);
            if (linearLayout != null) {
                i = 2131362560;
                MaterialButton materialButtonJ = w1h.j(2131362560, viewInflate);
                if (materialButtonJ != null) {
                    i = 2131363930;
                    MaterialButton materialButtonJ2 = w1h.j(2131363930, viewInflate);
                    if (materialButtonJ2 != null) {
                        i = 2131364040;
                        MaterialButton materialButtonJ3 = w1h.j(2131364040, viewInflate);
                        if (materialButtonJ3 != null) {
                            i = 2131364054;
                            MaterialButton materialButtonJ4 = w1h.j(2131364054, viewInflate);
                            if (materialButtonJ4 != null) {
                                i = 2131364407;
                                MaterialButton materialButtonJ5 = w1h.j(2131364407, viewInflate);
                                if (materialButtonJ5 != null) {
                                    this.e = new ei((ViewGroup) viewInflate, (View) scrollView, (View) linearLayout, (View) materialButtonJ, (View) materialButtonJ2, (View) materialButtonJ3, (View) materialButtonJ4, (View) materialButtonJ5, (byte) 1);
                                    this.b = new shf(pdeVar, scrollView);
                                    this.f = w1h.l(browserActivity, vml.d, "ad_debug", new bg1[0]);
                                    wy wyVarX0 = browserActivity.x0();
                                    this.d = wyVarX0;
                                    wyVarX0.S(browserActivity, new nl(this, (byte) 0));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.knf
    public final ikc B() {
        return this.a;
    }

    @Override // defpackage.knf
    public final void E() {
    }

    @Override // defpackage.knf
    public final void F() {
    }

    @Override // defpackage.knf
    public final void a() {
    }

    @Override // defpackage.knf
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void c(final orb orbVar) {
        ei eiVar = this.e;
        LinearLayout linearLayout = (LinearLayout) eiVar.d;
        LinearLayout linearLayout2 = (LinearLayout) eiVar.d;
        linearLayout.removeAllViews();
        long j = ((SharedPreferences) this.f.get()).getLong("sync_timestamp", 0L);
        if (j != 0) {
            orbVar.p(tl.a(j), "syncTimestamp");
        }
        Iterator<String> itKeys = orbVar.a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object objA = orbVar.a(next);
                ?? operaListItem = new OperaListItem(linearLayout2.getContext(), null, 2132084979);
                operaListItem.E(new qxh(next));
                operaListItem.C(new qxh(String.valueOf(objA)));
                linearLayout2.addView((View) operaListItem, new ViewGroup.LayoutParams(-1, -2));
            } catch (JSONException unused) {
            }
        }
        final byte b = 0;
        eiVar.e.setOnClickListener(new View.OnClickListener() { // from class: ol
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                orb orbVar2 = orbVar;
                switch (b2) {
                    case 0:
                        orbVar2.getClass();
                        try {
                            am2.v(ay3.a("data:application/octet-stream;base64," + Base64.encodeToString(orbVar2.a.toString(4).replace("\\/", "/").getBytes(), 2), lqm.d, false));
                            break;
                        } catch (JSONException e) {
                            t3p.n(e);
                            return;
                        }
                    default:
                        Context context = view.getContext();
                        orbVar2.getClass();
                        try {
                            String strReplace = orbVar2.a.toString(4).replace("\\/", "/");
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.putExtra("android.intent.extra.SUBJECT", "Ad debug JSON data");
                            intent.putExtra("android.intent.extra.TEXT", strReplace);
                            intent.setType("application/json");
                            context.startActivity(intent);
                            break;
                        } catch (JSONException e2) {
                            t3p.n(e2);
                        }
                }
            }
        });
        final byte b2 = 1;
        eiVar.i.setOnClickListener(new View.OnClickListener() { // from class: ol
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                orb orbVar2 = orbVar;
                switch (b22) {
                    case 0:
                        orbVar2.getClass();
                        try {
                            am2.v(ay3.a("data:application/octet-stream;base64," + Base64.encodeToString(orbVar2.a.toString(4).replace("\\/", "/").getBytes(), 2), lqm.d, false));
                            break;
                        } catch (JSONException e) {
                            t3p.n(e);
                            return;
                        }
                    default:
                        Context context = view.getContext();
                        orbVar2.getClass();
                        try {
                            String strReplace = orbVar2.a.toString(4).replace("\\/", "/");
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.putExtra("android.intent.extra.SUBJECT", "Ad debug JSON data");
                            intent.putExtra("android.intent.extra.TEXT", strReplace);
                            intent.setType("application/json");
                            context.startActivity(intent);
                            break;
                        } catch (JSONException e2) {
                            t3p.n(e2);
                        }
                }
            }
        });
        eiVar.h.setOnClickListener(new View.OnClickListener(this) { // from class: pl
            public final /* synthetic */ sl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                byte b4 = 1;
                byte b5 = 0;
                sl slVar = this.b;
                switch (b3) {
                    case 0:
                        Context context = view.getContext();
                        wy wyVar = slVar.d;
                        wyVar.R();
                        ((SharedPreferences) slVar.f.get()).edit().remove("sync_timestamp").apply();
                        wyVar.S(context, new nl(slVar, (byte) 0));
                        break;
                    case 1:
                        slVar.d.S(view.getContext(), new nl(slVar, (byte) 1));
                        break;
                    default:
                        Context context2 = view.getContext();
                        z77 z77VarU = sfe.U(context2);
                        qxh qxhVar = new qxh("Start recording a video and continue when ready.");
                        ql qlVar = new ql(slVar, context2, b5);
                        ql qlVar2 = new ql(slVar, context2, b4);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = "Sync and restart";
                        gkjVar.b = null;
                        gkjVar.c = "Sync";
                        gkjVar.d = "Prepare sync";
                        gkjVar.e = null;
                        gkjVar.f = null;
                        gkjVar.g = null;
                        gkjVar.h = qlVar;
                        gkjVar.i = null;
                        gkjVar.j = qlVar2;
                        gkjVar.k = 0;
                        gkjVar.l = 0;
                        gkjVar.m = 0;
                        gkjVar.n = true;
                        gkjVar.o = qxhVar;
                        z77VarU.getClass();
                        z77VarU.b(gkjVar, ijm.b);
                        break;
                }
            }
        });
        eiVar.g.setOnClickListener(new View.OnClickListener(this) { // from class: pl
            public final /* synthetic */ sl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                byte b4 = 1;
                byte b5 = 0;
                sl slVar = this.b;
                switch (b3) {
                    case 0:
                        Context context = view.getContext();
                        wy wyVar = slVar.d;
                        wyVar.R();
                        ((SharedPreferences) slVar.f.get()).edit().remove("sync_timestamp").apply();
                        wyVar.S(context, new nl(slVar, (byte) 0));
                        break;
                    case 1:
                        slVar.d.S(view.getContext(), new nl(slVar, (byte) 1));
                        break;
                    default:
                        Context context2 = view.getContext();
                        z77 z77VarU = sfe.U(context2);
                        qxh qxhVar = new qxh("Start recording a video and continue when ready.");
                        ql qlVar = new ql(slVar, context2, b5);
                        ql qlVar2 = new ql(slVar, context2, b4);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = "Sync and restart";
                        gkjVar.b = null;
                        gkjVar.c = "Sync";
                        gkjVar.d = "Prepare sync";
                        gkjVar.e = null;
                        gkjVar.f = null;
                        gkjVar.g = null;
                        gkjVar.h = qlVar;
                        gkjVar.i = null;
                        gkjVar.j = qlVar2;
                        gkjVar.k = 0;
                        gkjVar.l = 0;
                        gkjVar.m = 0;
                        gkjVar.n = true;
                        gkjVar.o = qxhVar;
                        z77VarU.getClass();
                        z77VarU.b(gkjVar, ijm.b);
                        break;
                }
            }
        });
        final byte b3 = 2;
        ((MaterialButton) eiVar.f).setOnClickListener(new View.OnClickListener(this) { // from class: pl
            public final /* synthetic */ sl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                byte b4 = 1;
                byte b5 = 0;
                sl slVar = this.b;
                switch (b32) {
                    case 0:
                        Context context = view.getContext();
                        wy wyVar = slVar.d;
                        wyVar.R();
                        ((SharedPreferences) slVar.f.get()).edit().remove("sync_timestamp").apply();
                        wyVar.S(context, new nl(slVar, (byte) 0));
                        break;
                    case 1:
                        slVar.d.S(view.getContext(), new nl(slVar, (byte) 1));
                        break;
                    default:
                        Context context2 = view.getContext();
                        z77 z77VarU = sfe.U(context2);
                        qxh qxhVar = new qxh("Start recording a video and continue when ready.");
                        ql qlVar = new ql(slVar, context2, b5);
                        ql qlVar2 = new ql(slVar, context2, b4);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = "Sync and restart";
                        gkjVar.b = null;
                        gkjVar.c = "Sync";
                        gkjVar.d = "Prepare sync";
                        gkjVar.e = null;
                        gkjVar.f = null;
                        gkjVar.g = null;
                        gkjVar.h = qlVar;
                        gkjVar.i = null;
                        gkjVar.j = qlVar2;
                        gkjVar.k = 0;
                        gkjVar.l = 0;
                        gkjVar.m = 0;
                        gkjVar.n = true;
                        gkjVar.o = qxhVar;
                        z77VarU.getClass();
                        z77VarU.b(gkjVar, ijm.b);
                        break;
                }
            }
        });
    }

    @Override // defpackage.knf
    public final void d() {
    }

    @Override // defpackage.knf
    public final void e() {
    }

    @Override // defpackage.knf
    public final String getUrl() {
        return this.c;
    }

    @Override // defpackage.knf
    public final OperaPageRootView getView() {
        return (OperaPageRootView) this.e.b;
    }

    @Override // defpackage.knf
    public final String n() {
        return "Ad Debug";
    }

    @Override // defpackage.knf
    public final void o() {
        ((ScrollView) this.e.c).smoothScrollBy(0, 0);
    }

    @Override // defpackage.knf
    public final void q() {
        ((ScrollView) this.e.c).scrollTo(0, 0);
    }

    @Override // defpackage.knf
    public final void r() {
        shf shfVar = this.b;
        ScrollView scrollView = (ScrollView) shfVar.b;
        if (scrollView.isAttachedToWindow()) {
            return;
        }
        mnf mnfVar = (mnf) ((pde) shfVar.a).g();
        scrollView.setPadding(scrollView.getPaddingLeft(), mnfVar.a, scrollView.getPaddingRight(), mnfVar.b);
    }

    @Override // defpackage.knf
    public final void u() {
    }

    @Override // defpackage.knf
    public final boolean w() {
        return false;
    }

    @Override // defpackage.knf
    public final void y() {
    }

    @Override // defpackage.knf
    public final String z() {
        return "opera://ads-debug";
    }
}
