package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class i25 implements j6l {
    public final /* synthetic */ r9i a;

    public i25(r9i r9iVar) {
        this.a = r9iVar;
    }

    @Override // defpackage.j6l
    public final void onDestroy() {
        r9i r9iVar = this.a;
        ((k6l) r9iVar.b).H((i25) r9iVar.d);
        ((SettingsManager) r9iVar.c).H((j25) r9iVar.e);
    }
}
