package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.speech.SpeechRecognizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jbn {
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final Context a;
    public final oi b;
    public final oc2 c;
    public final umk d;
    public final l45 e;
    public final zyk f = z4c.b(new m2n(this, 1));
    public final ode g = new ode(b().get(0));

    static {
        on7 on7Var = pn7.b;
        h = cs5.x0(1000, un7.d);
    }

    public jbn(Context context, oi oiVar, oc2 oc2Var, umk umkVar, l45 l45Var) {
        this.a = context;
        this.b = oiVar;
        this.c = oc2Var;
        this.d = umkVar;
        this.e = l45Var;
    }

    public final ekc a() {
        return (ekc) this.f.getValue();
    }

    public final ArrayList b() {
        String strG = g();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d.a());
        if (arrayList.size() < 3 && strG != null && !arrayList.contains(strG)) {
            arrayList.add(strG);
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0181, code lost:
    
        r1.setRegion(r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 1886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbn.c(java.lang.String):java.lang.String");
    }

    public final void d(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        umk umkVar = this.d;
        List listA = umkVar.a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listA) {
            if (!str.equals((String) obj)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        if (arrayList.size() > 3) {
            arrayList.subList(3, arrayList.size()).clear();
        }
        ((SharedPreferences) umkVar.a.get()).edit().putString("languages", CollectionsKt.P(arrayList, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62)).apply();
        this.g.r(b().get(0));
    }

    public final void e(mw0 mw0Var, Function1 function1) {
        umk umkVar = this.d;
        b59 b59Var = umkVar.a;
        ((SharedPreferences) b59Var.get()).edit().putInt("usageCount", ((SharedPreferences) b59Var.get()).getInt("usageCount", 0) + 1).apply();
        Context context = this.a;
        if (!SpeechRecognizer.isRecognitionAvailable(context)) {
            function1.invoke(new fbn(zan.b));
            return;
        }
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        String strG = (String) CollectionsKt.firstOrNull(umkVar.a());
        if (strG == null) {
            strG = g();
        }
        intent.putExtra("android.speech.extra.LANGUAGE", c(strG));
        intent.putExtra("android.speech.extras.SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS", 5000);
        function1.invoke(dbn.a);
        if (fr3.Q(context, "android.permission.RECORD_AUDIO")) {
            abn abnVar = new abn(context, function1);
            abnVar.b(new gbn(abnVar));
            abnVar.g.startListening(intent);
            return;
        }
        uef uefVar = new uef(this, intent, function1, (byte) 9);
        y47 y47Var = new y47(function1, (byte) 24);
        qi qiVar = (qi) this.c.invoke();
        if (qiVar == null || (mw0Var != null && mw0Var.a.a.getBoolean("ai.never_ask_for_mic_permission", false))) {
            y47Var.invoke();
        } else {
            f03.U(qiVar, "android.permission.RECORD_AUDIO", new oam(false, uefVar, y47Var, mw0Var));
        }
    }

    public final void f(ibn ibnVar, Function1 function1) {
        String str;
        umk umkVar = this.d;
        b59 b59Var = umkVar.a;
        ((SharedPreferences) b59Var.get()).edit().putInt("usageCount", ((SharedPreferences) b59Var.get()).getInt("usageCount", 0) + 1).apply();
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        int iOrdinal = ibnVar.ordinal();
        if (iOrdinal == 0) {
            str = "web_search";
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
            str = "free_form";
        }
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        String strG = (String) CollectionsKt.firstOrNull(umkVar.a());
        if (strG == null) {
            strG = g();
        }
        intent.putExtra("android.speech.extra.LANGUAGE", c(strG));
        if (ibnVar == ibn.b) {
            intent.putExtra("android.speech.extras.SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS", 5000);
        }
        try {
            this.b.D(intent, new qj2(function1, (byte) 16));
        } catch (ActivityNotFoundException unused) {
            function1.invoke((Object) null);
        }
    }

    public final String g() {
        Locale localeB = cqp.c0(this.a.getResources().getConfiguration()).b(0);
        if (localeB != null) {
            return localeB.toLanguageTag();
        }
        return null;
    }
}
