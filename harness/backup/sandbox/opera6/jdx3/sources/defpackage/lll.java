package defpackage;

import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final /* synthetic */ class lll implements oll {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ThemeableLottieAnimationView b;
    public final /* synthetic */ dvb c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lll(ThemeableLottieAnimationView themeableLottieAnimationView, dvb dvbVar, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = themeableLottieAnimationView;
        this.c = dvbVar;
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.oll
    public final void a() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        dvb dvbVar = this.c;
        ThemeableLottieAnimationView themeableLottieAnimationView = this.b;
        switch (b) {
            case 0:
                int i = ThemeableLottieAnimationView.x;
                themeableLottieAnimationView.x(dvbVar, obj2, (ua7) obj);
                break;
            default:
                int i2 = ThemeableLottieAnimationView.x;
                ((n2d) themeableLottieAnimationView).d.b(dvbVar, obj2, new i2d((ykj) obj, (byte) 0));
                break;
        }
    }
}
