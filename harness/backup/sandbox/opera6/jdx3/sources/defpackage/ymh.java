package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ymh extends onh {
    public final q5g b;
    public final gnh c;
    public hj8 d;
    public final wf e;

    /* JADX WARN: Illegal instructions before constructor call */
    public ymh(q5g q5gVar, gnh gnhVar, ikc ikcVar, yqa yqaVar, ro9 ro9Var, jvk jvkVar) {
        LinearLayout linearLayout = (LinearLayout) q5gVar.b;
        super(linearLayout);
        this.b = q5gVar;
        this.c = gnhVar;
        RecyclerView recyclerView = (RecyclerView) q5gVar.d;
        kze kzeVar = (kze) new z61(recyclerView).b;
        wf wfVar = new wf((byte) 5);
        final byte b = 1;
        wfVar.setHasStableIds(true);
        wfVar.J(zmh.class, new ws1(kzeVar, gnhVar, ikcVar, yqaVar, (byte) 14), new j9h((byte) 8), new a3j((byte) 4));
        this.e = wfVar;
        flb flbVar = new flb(new nvk(recyclerView.getContext(), jvkVar));
        fbl fblVar = (fbl) q5gVar.c;
        AppCompatImageView appCompatImageView = (StylingImageView) fblVar.e;
        kkf kkfVar = new kkf(this, (byte) 10);
        dll dllVarS = q9n.s(appCompatImageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, appCompatImageView, kkfVar);
        }
        linearLayout.setClipToOutline(true);
        final byte b2 = 0;
        fblVar.b.setOnClickListener(new View.OnClickListener(this) { // from class: xmh
            public final /* synthetic */ ymh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                ymh ymhVar = this.b;
                switch (b3) {
                    case 0:
                        hj8 hj8Var = ymhVar.d;
                        if (hj8Var != null) {
                            gnh gnhVar2 = ymhVar.c;
                            if (gnhVar2.h.remove(Integer.valueOf(hj8Var.a.a))) {
                                gnhVar2.e();
                                break;
                            }
                        }
                        break;
                    case 1:
                        hj8 hj8Var2 = ymhVar.d;
                        if (hj8Var2 != null) {
                            gnh gnhVar3 = ymhVar.c;
                            if (gnhVar3.h.remove(Integer.valueOf(hj8Var2.a.a))) {
                                gnhVar3.e();
                                break;
                            }
                        }
                        break;
                    default:
                        hj8 hj8Var3 = ymhVar.d;
                        if (hj8Var3 != null) {
                            gnh gnhVar4 = ymhVar.c;
                            ArrayList arrayList = hj8Var3.b;
                            gnhVar4.getClass();
                            new xw((Object) arrayList, (Object) gnhVar4, (byte) 8).o(view);
                            break;
                        }
                        break;
                }
            }
        });
        ((StylingImageButton) fblVar.c).setOnClickListener(new View.OnClickListener(this) { // from class: xmh
            public final /* synthetic */ ymh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                ymh ymhVar = this.b;
                switch (b3) {
                    case 0:
                        hj8 hj8Var = ymhVar.d;
                        if (hj8Var != null) {
                            gnh gnhVar2 = ymhVar.c;
                            if (gnhVar2.h.remove(Integer.valueOf(hj8Var.a.a))) {
                                gnhVar2.e();
                                break;
                            }
                        }
                        break;
                    case 1:
                        hj8 hj8Var2 = ymhVar.d;
                        if (hj8Var2 != null) {
                            gnh gnhVar3 = ymhVar.c;
                            if (gnhVar3.h.remove(Integer.valueOf(hj8Var2.a.a))) {
                                gnhVar3.e();
                                break;
                            }
                        }
                        break;
                    default:
                        hj8 hj8Var3 = ymhVar.d;
                        if (hj8Var3 != null) {
                            gnh gnhVar4 = ymhVar.c;
                            ArrayList arrayList = hj8Var3.b;
                            gnhVar4.getClass();
                            new xw((Object) arrayList, (Object) gnhVar4, (byte) 8).o(view);
                            break;
                        }
                        break;
                }
            }
        });
        final byte b3 = 2;
        ((StylingImageButton) fblVar.d).setOnClickListener(new View.OnClickListener(this) { // from class: xmh
            public final /* synthetic */ ymh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                ymh ymhVar = this.b;
                switch (b32) {
                    case 0:
                        hj8 hj8Var = ymhVar.d;
                        if (hj8Var != null) {
                            gnh gnhVar2 = ymhVar.c;
                            if (gnhVar2.h.remove(Integer.valueOf(hj8Var.a.a))) {
                                gnhVar2.e();
                                break;
                            }
                        }
                        break;
                    case 1:
                        hj8 hj8Var2 = ymhVar.d;
                        if (hj8Var2 != null) {
                            gnh gnhVar3 = ymhVar.c;
                            if (gnhVar3.h.remove(Integer.valueOf(hj8Var2.a.a))) {
                                gnhVar3.e();
                                break;
                            }
                        }
                        break;
                    default:
                        hj8 hj8Var3 = ymhVar.d;
                        if (hj8Var3 != null) {
                            gnh gnhVar4 = ymhVar.c;
                            ArrayList arrayList = hj8Var3.b;
                            gnhVar4.getClass();
                            new xw((Object) arrayList, (Object) gnhVar4, (byte) 8).o(view);
                            break;
                        }
                        break;
                }
            }
        });
        recyclerView.B0(new k56());
        recyclerView.D0(ro9Var);
        recyclerView.getContext();
        recyclerView.C0(new LinearLayoutManager());
        recyclerView.y0(wfVar);
        recyclerView.setNestedScrollingEnabled(false);
        flbVar.e(recyclerView);
    }

    @Override // defpackage.onh
    public final boolean U() {
        return false;
    }

    @Override // defpackage.onh
    public final List V() {
        hj8 hj8Var = this.d;
        ArrayList arrayList = hj8Var != null ? hj8Var.b : null;
        return arrayList == null ? l08.a : arrayList;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void X() {
        hj8 hj8Var = this.d;
        if (hj8Var == null) {
            return;
        }
        k4l k4lVarB = hj8Var.a.b();
        ?? r5 = (StylingImageView) ((fbl) this.b.c).e;
        g8i g8iVar = new g8i(r5.getContext());
        String str = String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(hj8Var.b.size())}, 1));
        if (str.length() > 2) {
            str = "…";
        }
        g8iVar.e = str;
        g8iVar.f = k4lVarB.b.a(r5.getContext());
        g8iVar.c = k4lVarB.a.a(r5.getContext());
        g8iVar.b = 2131167389;
        g8iVar.g = 2131167390;
        r5.setImageDrawable(g8iVar.a());
    }
}
