package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.SuggestionProviderBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class xk3 extends SuggestionProviderBridge {
    public final ArrayList d;
    public boolean e;

    public xk3(Context context, tcc tccVar) {
        super(0);
        this.e = true;
        xnh xnhVarT = xnh.t(context);
        aib.C(xnhVarT, tccVar, new ty(this, xnhVarT, (byte) 1));
        TreeSet treeSet = new TreeSet(Arrays.asList("hotels", "hotel"));
        treeSet.add("🏨");
        treeSet.add(context.getResources().getString(2132019263).toLowerCase(Locale.getDefault()));
        treeSet.add(context.getResources().getString(2132019262).toLowerCase(Locale.getDefault()));
        this.d = new ArrayList(treeSet);
    }

    public static String h(String str) {
        return new Uri.Builder().scheme("https").authority("www.booking.com").appendPath("searchresults.html").appendQueryParameter("ss", str).appendQueryParameter("aid", "1759515").appendQueryParameter("label", "obs_mdot").build().toString();
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void g(String str, boolean z, boolean z2, yv4 yv4Var) {
        Object obj;
        if (z2 || this.e || !wqm.x(str)) {
            yv4Var.d(Collections.EMPTY_LIST);
            return;
        }
        String strTrim = str.toLowerCase(Locale.getDefault()).trim();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                String strTrim2 = str.trim();
                Locale localeH = n6h.h(strTrim);
                bpd bpdVar = localeH == null ? new bpd(Collections.singletonList(strTrim), Collections.singletonList(strTrim2), (byte) 6) : new bpd(n6h.q(strTrim, localeH), n6h.q(strTrim2, localeH), (byte) 6);
                List list = (List) bpdVar.b;
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = false;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        if (((String) obj2).equals(list.get(i2))) {
                            if (!z3) {
                                z3 = true;
                            }
                        }
                    }
                    arrayList2.add((String) ((List) bpdVar.c).get(i2));
                }
                String strJoin = (!z3 || arrayList2.size() <= 0) ? null : TextUtils.join(strTrim2.indexOf(" ") > 0 ? " " : "", arrayList2);
                if (strJoin == null) {
                    yv4Var.d(Collections.EMPTY_LIST);
                    return;
                } else {
                    yv4Var.d(Collections.singletonList(new Suggestion(16, "Booking.com: ".concat(strJoin), "", h(strJoin), null, null, Integer.MAX_VALUE, "", 0, -1, null)));
                    return;
                }
            }
            obj = arrayList.get(i);
            i++;
        } while (!strTrim.equals((String) obj));
        yv4Var.d(Collections.singletonList(new Suggestion(16, "Booking.com", "", h(""), null, null, Integer.MAX_VALUE, "", 0, -1, null)));
    }
}
