package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final /* synthetic */ class t00 implements p5j {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t00(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                v00 v00Var = (v00) obj2;
                fp1 fp1Var = (hjf) obj;
                int iHashCode = str.hashCode();
                if (iHashCode != -853878847) {
                    if (iHashCode != 810894546 || !str.equals("personalized_default")) {
                    }
                } else if (!str.equals("personalized_ads")) {
                }
                v00Var.c(fp1Var);
                break;
            case 1:
                syd sydVar = (syd) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if ("offline_pages_location".equals(str)) {
                    sydVar.a(sharedPreferences, false);
                    break;
                }
                break;
            case 2:
                s4f s4fVar = (s4f) obj;
                if (((psi) obj2).s.contains(str)) {
                    s4fVar.invoke();
                    break;
                }
                break;
            default:
                mqk mqkVar = (mqk) obj;
                if (str.equals((String) obj2)) {
                    mqkVar.e();
                    break;
                }
                break;
        }
    }
}
