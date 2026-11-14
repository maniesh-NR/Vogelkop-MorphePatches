package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final /* synthetic */ class wc9 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wc9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                xc9 xc9Var = (xc9) obj;
                if ("unread_message".equals(str)) {
                    sharedPreferences.getBoolean(str, false);
                    h7f h7fVar = xc9Var.a;
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((s1f) g7fVarH.next()).a.b();
                    }
                    break;
                }
                break;
            default:
                m9c m9cVar = (m9c) obj;
                if ("ad_set".equals(str)) {
                    i7f i7fVar = m9cVar.d;
                    g7f g7fVarC = u35.c(i7fVar, i7fVar);
                    while (g7fVarC.hasNext()) {
                        aac aacVar = (aac) g7fVarC.next();
                        bac bacVar = aacVar.a;
                        m9c m9cVar2 = bacVar.b;
                        if (m9cVar2.a() != null) {
                            i7f i7fVar2 = m9cVar2.d;
                            if (i7fVar2.c(aacVar) && i7fVar2.c == 0) {
                                ((SharedPreferences) m9cVar2.b.get()).unregisterOnSharedPreferenceChangeListener(m9cVar2.e);
                            }
                            bacVar.c();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
