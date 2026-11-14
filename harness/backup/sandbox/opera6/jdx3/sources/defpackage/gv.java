package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.opera.android.OperaApplication;
import com.opera.android.startup.WelcomeActivity;
import com.opera.android.webapps.ShortcutHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class gv implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gv(int i, Collection collection, byte b) {
        this.a = b;
        this.b = i;
        this.c = collection;
    }

    public /* synthetic */ gv(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.content.Context, dx3] */
    /* JADX WARN: Type inference failed for: r14v15, types: [android.app.Activity, com.opera.android.startup.WelcomeActivity] */
    public final Object invoke(Object obj) {
        s2 s2Var;
        byte b = this.a;
        int i = 0;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                lxh lxhVar = new lxh(2131231724);
                ?? r13 = (dx3) ((hd) obj2).c;
                return ShortcutHelper.b(r13, z5i.x(lxhVar.f(r13), i2, i2), null, 0, 0);
            case 1:
                au2 au2Var = (au2) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    au2Var.notifyItemChanged(i2);
                }
                return Unit.a;
            case 2:
                ((k4a) ((ne5) obj2).f).c((Drawable) obj, i2);
                return Unit.a;
            case 3:
                ArrayList arrayList = (ArrayList) obj2;
                yj0 yj0Var = (yj0) obj;
                int iA = vep.A(i2);
                if (iA == 0) {
                    s2Var = new s2(2, yj0Var, yj0.class, "putStartPageSuggestedSites", "putStartPageSuggestedSites$behavior_impl(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", 0, (byte) 18);
                } else if (iA == 1) {
                    s2Var = new s2(2, yj0Var, yj0.class, "putOmnibarSuggestedSites", "putOmnibarSuggestedSites$behavior_impl(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", 0, (byte) 19);
                } else if (iA == 2) {
                    s2Var = new s2(2, yj0Var, yj0.class, "putOmnibarSearchSuggestions", "putOmnibarSearchSuggestions$behavior_impl(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", 0, (byte) 20);
                } else {
                    if (iA != 3) {
                        h9o.p();
                        return null;
                    }
                    s2Var = new s2(2, yj0Var, yj0.class, "putOmnibarAutocompleteSuggestions", "putOmnibarAutocompleteSuggestions$behavior_impl(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", 0, (byte) 21);
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    a3g a3gVar = (a3g) obj3;
                    s2Var.invoke(String.valueOf(a3gVar.a), new o5f((Object) a3gVar, (byte) 15));
                }
                return Unit.a;
            case 4:
                ifg ifgVar = (ifg) obj2;
                p1d.h((p1d) obj, ifgVar, (i2 - ifgVar.a) / 2, 0);
                return Unit.a;
            case 5:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                z5l z5lVar = (z5l) ((z5l) obj2).u.c;
                z5lVar.b();
                exg.z(z5lVar.f, iIntValue, i2);
                return Unit.a;
            case 7:
                ifd ifdVar = (ifd) obj;
                c7n c7nVar = (c7n) ((WeakReference) obj2).get();
                if (c7nVar != null && c7nVar.r == i2) {
                    c7nVar.o0(ifdVar);
                }
                return Unit.a;
            default:
                List list = (List) obj2;
                ?? r14 = (WelcomeActivity) obj;
                xbf xbfVar = r14.v;
                mcj mcjVar = r14.r;
                mcj mcjVar2 = mcjVar == null ? null : mcjVar;
                String[] strArr = OperaApplication.K;
                pdf pdfVar = new pdf(mcjVar2, ((OperaApplication) r14.getApplication()).L().c, (mdf) ((j4c) xbfVar.f).get(), ((OperaApplication) r14.getApplication()).h(), (yl6) ((mi) ((xbf) xbfVar.b).b).m.get());
                Bundle bundle = new Bundle();
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(k95.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((m0o) it.next()).name());
                }
                bundle.putStringArray("key.onboarding_page_ids", (String[]) arrayList2.toArray(new String[0]));
                bundle.putInt("key.steps_after_feature_onboarding", i2);
                pdfVar.setArguments(bundle);
                return pdfVar;
        }
    }
}
