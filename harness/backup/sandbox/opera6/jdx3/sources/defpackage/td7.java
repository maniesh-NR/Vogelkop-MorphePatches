package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public final /* synthetic */ class td7 implements bg1, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ td7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final br9 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new nr9(1, (wd7) obj, wd7.class, "onPrefsLoaded", "onPrefsLoaded(Landroid/content/SharedPreferences;)V", 0);
            default:
                return new nr9(1, (mlf) obj, mlf.class, "maybeScheduleReport", "maybeScheduleReport(Landroid/content/SharedPreferences;)V", 0);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof bg1) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof bg1) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        LinkedHashMap linkedHashMapD;
        switch (this.a) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                wd7 wd7Var = (wd7) this.b;
                pqh pqhVar = new pqh();
                String string = sharedPreferences.getString("id", null);
                pqhVar.a = string;
                if (string == null) {
                    pqhVar.a = UUID.randomUUID().toString();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("id", (String) pqhVar.a);
                    editorEdit.apply();
                }
                wd7Var.b.d(new fh4(wd7Var, pqhVar, (byte) 29)).a(null);
                return;
            default:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                mlf mlfVar = (mlf) this.b;
                synchronized (mlfVar.f) {
                    linkedHashMapD = mlf.d(sharedPreferences2);
                }
                if (linkedHashMapD.isEmpty()) {
                    return;
                }
                for (Map.Entry entry : linkedHashMapD.entrySet()) {
                    String str = (String) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    if (c.q(str, "stop_event_", false) && iIntValue > 0) {
                        new rml(Unit.a, (umi) mlfVar.b).a(new o5f(mlfVar, (byte) 11)).q(mlfVar.a);
                        return;
                    }
                }
                return;
        }
    }
}
