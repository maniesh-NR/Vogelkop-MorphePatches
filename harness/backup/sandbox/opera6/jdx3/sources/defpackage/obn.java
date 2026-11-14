package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.ad.interstitial.AdActivity;
import com.opera.android.OperaApplication;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class obn implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ obn(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        qb7 qb7Var;
        Object obj;
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((pbn) obj3).c.invoke((lbn) obj2);
                break;
            case 1:
                ((tah) ((ev5) obj3).c).M((fdn) obj2);
                break;
            case 2:
                Context context = view.getContext();
                String[] strArr = OperaApplication.K;
                ydn ydnVarR = ((OperaApplication) context.getApplicationContext()).R();
                ydnVarR.F(new qcn(ydnVarR, (ysj) obj3, (gjm) obj2));
                ydnVarR.C(true);
                break;
            case 3:
                ((hdn) ((idn) obj3).l).run((fdn) obj2);
                break;
            case 4:
                ((jdn) obj3).h.run((fdn) obj2);
                break;
            case 5:
                cgn cgnVar = (cgn) obj3;
                boolean z = ((dgh) obj2) instanceof bfn;
                x5f x5fVar = cgnVar.C;
                if (z) {
                    kcn[] kcnVarArr = kcn.a;
                    if (x5fVar.h) {
                        zpa zpaVar = x5fVar.d;
                        x56 x56VarF = zpa.F();
                        am2.f(zpaVar, x56VarF).b("vpn_pro_paused", new zbe((byte) 17));
                        x5fVar.U0(x56VarF);
                    }
                } else {
                    kcn[] kcnVarArr2 = kcn.a;
                    if (x5fVar.h) {
                        zpa zpaVar2 = x5fVar.d;
                        x56 x56VarF2 = zpa.F();
                        am2.f(zpaVar2, x56VarF2).b("vpn_pro_canceled", new zbe((byte) 17));
                        x5fVar.U0(x56VarF2);
                    }
                }
                cgnVar.L0();
                break;
            case 6:
                ukn uknVar = (ukn) obj3;
                r3i r3iVar = (r3i) obj2;
                boolean z2 = uknVar.I;
                AppCompatImageView appCompatImageView = uknVar.B;
                r3iVar.k = z2;
                r3iVar.p(appCompatImageView);
                break;
            case 7:
                ((g8j) ((d8j) ((pk5) obj3).l)).j(c8j.d, new int[0]);
                ((qf) obj2).b();
                break;
            case 8:
                jl6 jl6Var = (jl6) obj3;
                jmn jmnVar = (jmn) jl6Var.g;
                jmnVar.I.b(jmnVar.getViewLifecycleOwner(), o3i.WALLPAPER_GALLERY, (k15) obj2, q4i.a, new qfl((Object) jl6Var, (byte) 22));
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                mqn mqnVar = (mqn) obj2;
                if (((s6h) obj3).I()) {
                    vl6 vl6Var = mqnVar.T;
                    if (vl6Var == null) {
                        vl6Var = null;
                    }
                    vl6Var.S();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((mrn) ((z4k) ((yw) obj3).e).b).p.f(new grn(((sqn) obj2).a));
                break;
            case 11:
                ((o6o) obj3).h.invoke(((z6o) obj2).b.getContext());
                break;
            case 12:
                ((rn9) obj3).J(kf0.c);
                ((kdo) obj2).i.run();
                break;
            case 13:
                ((roj) obj3).a(((rmo) obj2).b);
                break;
            case 14:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) obj3));
                intent.addFlags(268435456);
                ((AdActivity) obj2).startActivity(intent);
                break;
            case 15:
                ((Dialog) ((mcj) obj3).a).dismiss();
                ((Dialog) ((mcj) obj2).a).show();
                break;
            case 16:
                AdActivity adActivity = (AdActivity) obj2;
                zgb zgbVar = (zgb) ((uuj) obj3).c;
                if (zgbVar != null && (qb7Var = zgbVar.b.p) != null) {
                    ((j10) qb7Var.b).a.x((yz) qb7Var.c, ((h10) qb7Var.a).v);
                }
                adActivity.finish();
                break;
            default:
                qjo qjoVar = (qjo) obj3;
                p12 p12Var = (p12) obj2;
                jvg jvgVar = qjoVar.e;
                AdActivity adActivity2 = (AdActivity) qjoVar.b;
                String str = (String) p12Var.a;
                String str2 = (String) p12Var.b;
                String str3 = (String) p12Var.c;
                String string = (String) p12Var.e;
                String string2 = (String) p12Var.f;
                String str4 = (String) p12Var.g;
                ArrayList arrayList = (ArrayList) p12Var.h;
                roj rojVar = new roj(qjoVar, p12Var, (byte) 24);
                jvgVar.getClass();
                boolean z3 = (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) ? false : true;
                mcj mcjVar = (mcj) jvgVar.c;
                if (mcjVar == null) {
                    String string3 = adActivity2.getResources().getString(z3 ? 2132017398 : 2132017393);
                    if (!z3) {
                        str4 = string2;
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        string3 = str4;
                    }
                    mcj mcjVar2 = new mcj(adActivity2, 2131558460);
                    ViewGroup viewGroup = (ViewGroup) mcjVar2.b;
                    ((TextView) viewGroup.findViewById(2131361999)).setText(string3);
                    if (arrayList == null || arrayList.isEmpty()) {
                        ArrayList arrayList2 = p12.i;
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            p12.i = new ArrayList(4);
                            Resources resources = adActivity2.getResources();
                            p12.i.add(new rmo(resources.getString(2132017396), 1));
                            p12.i.add(new rmo(resources.getString(2132017395), 3));
                            p12.i.add(new rmo(resources.getString(2132017397), 4));
                            p12.i.add(new rmo(resources.getString(2132017394), 2));
                        }
                        jvg.o(viewGroup, p12.i, rojVar);
                    } else {
                        jvg.o(viewGroup, arrayList, rojVar);
                    }
                    jvgVar.c = mcjVar2;
                    mcjVar = mcjVar2;
                }
                if (z3) {
                    mcj mcjVar3 = (mcj) jvgVar.b;
                    if (mcjVar3 == null) {
                        if (TextUtils.isEmpty(string2)) {
                            string2 = adActivity2.getResources().getString(2132017393);
                        }
                        if (TextUtils.isEmpty(string)) {
                            string = adActivity2.getResources().getString(2132017400);
                        }
                        mcj mcjVar4 = (mcj) jvgVar.c;
                        mcj mcjVar5 = new mcj(adActivity2, 2131558461);
                        ViewGroup viewGroup2 = (ViewGroup) mcjVar5.b;
                        if (!TextUtils.isEmpty(str)) {
                            ImageView imageView = (ImageView) viewGroup2.findViewById(2131361914);
                            imageView.setVisibility(0);
                            fip.b(adActivity2, str, new ugo(imageView, adActivity2));
                        }
                        ((TextView) viewGroup2.findViewById(2131361912)).setText(str2);
                        ((TextView) viewGroup2.findViewById(2131361913)).setText(string);
                        viewGroup2.findViewById(2131361913).setOnClickListener(new obn(str3, adActivity2, (byte) 14));
                        TextView textView = (TextView) viewGroup2.findViewById(2131363110);
                        textView.setText(string2);
                        textView.setOnClickListener(new obn(mcjVar5, mcjVar4, (byte) 15));
                        jvgVar.b = mcjVar5;
                        mcjVar3 = mcjVar5;
                    }
                    obj = mcjVar3.a;
                } else {
                    obj = mcjVar.a;
                }
                ((Dialog) obj).show();
                break;
        }
    }
}
