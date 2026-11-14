package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.opera.android.custom_views.FadingNestedScrollView;
import com.opera.android.mainmenu.MainMenuSheetToggleLayout;
import com.opera.android.mainmenu.ToggleAnimationView;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class wrl extends lim implements p5j {
    public final Resources a;
    public final h73 b;
    public final vrl c;
    public final srl d;
    public final rrl e;
    public final trl f;
    public final FadingNestedScrollView g;
    public final qm9 h;

    public wrl(Context context, h73 h73Var, MainMenuSheetToggleLayout mainMenuSheetToggleLayout, MainMenuSheetToggleLayout mainMenuSheetToggleLayout2, MainMenuSheetToggleLayout mainMenuSheetToggleLayout3, MainMenuSheetToggleLayout mainMenuSheetToggleLayout4, FadingNestedScrollView fadingNestedScrollView, qm9 qm9Var) {
        this.a = context.getResources();
        this.b = h73Var;
        SettingsManager settingsManager = h73Var.d;
        ydn ydnVar = h73Var.e;
        i3j i3jVar = new i3j(context, settingsManager, ydnVar, h73Var.k);
        byte b = 16;
        vrl vrlVar = new vrl(mainMenuSheetToggleLayout, new crk(this, b), ydnVar, h73Var.j, i3jVar);
        this.c = vrlVar;
        crk crkVar = new crk(this, b);
        SettingsManager settingsManager2 = h73Var.d;
        srl srlVar = new srl(mainMenuSheetToggleLayout2, crkVar, settingsManager2, i3jVar);
        this.d = srlVar;
        rrl rrlVar = new rrl(mainMenuSheetToggleLayout3, new crk(this, b), settingsManager2);
        this.e = rrlVar;
        trl trlVar = new trl(mainMenuSheetToggleLayout4, new crk(this, b), h73Var.d, h73Var.f, h73Var.j);
        this.f = trlVar;
        this.g = fadingNestedScrollView;
        this.h = qm9Var;
        vrlVar.s0();
        vrlVar.o.F(vrlVar);
        vrlVar.r.e();
        srlVar.s0();
        nrl nrlVar = srlVar.p;
        ToggleAnimationView toggleAnimationView = (ToggleAnimationView) nrlVar.b;
        int i = nrlVar.a ? 18 : 36;
        toggleAnimationView.s(0, i, i, null);
        rrlVar.s0();
        nrl nrlVar2 = rrlVar.p;
        ToggleAnimationView toggleAnimationView2 = (ToggleAnimationView) nrlVar2.b;
        int i2 = nrlVar2.a ? 18 : 36;
        toggleAnimationView2.s(0, i2, i2, null);
        trlVar.s0();
        nrl nrlVar3 = trlVar.p;
        ToggleAnimationView toggleAnimationView3 = (ToggleAnimationView) nrlVar3.b;
        int i3 = nrlVar3.a ? 18 : 36;
        toggleAnimationView3.s(0, i3, i3, null);
        owe.c.F(trlVar);
        trlVar.q.h.b(trlVar);
        settingsManager2.F(this);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        switch (str) {
            case "ad_blocking":
                this.e.s0();
                break;
            case "night_mode":
            case "night_mode_schedule":
                this.f.s0();
                break;
            case "compression":
                this.d.s0();
                break;
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.b.d.H(this);
        this.c.P();
        ((MainMenuSheetToggleLayout) this.d.a).setOnClickListener(null);
        ((MainMenuSheetToggleLayout) this.e.a).setOnClickListener(null);
        this.f.P();
    }
}
