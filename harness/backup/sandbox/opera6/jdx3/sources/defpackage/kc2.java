package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.aiassistant.appwidget.AiAssistantAppWidget;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kc2 extends i93 implements o37 {
    public static final /* synthetic */ xtb[] x = {new d6h(kc2.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentAssistantSettingsBinding;", 0)};
    public final g0c t;
    public final ua7 u;
    public final ktl v;
    public final zyk w;

    public kc2(gjm gjmVar, g0c g0cVar) {
        super(2132017424, 2131755015, 12);
        this.t = g0cVar;
        this.u = new ua7((Fragment) this, gjmVar);
        this.v = F0(new t40((byte) 22));
        this.w = z4c.b(new t2(this, (byte) 10));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final dl9 H0() {
        xtb xtbVar = x[0];
        a5n a5nVar = this.v.b;
        Objects.requireNonNull(a5nVar);
        return (dl9) a5nVar;
    }

    public final qc2 I0() {
        return (qc2) this.w.getValue();
    }

    @Override // defpackage.i93, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        menuItem.getItemId();
        return super.onMenuItemClick(menuItem);
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        byte b = 12;
        H0().g.u = new wth(I0(), b);
        final byte b2 = 2;
        H0().b.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                kc2 kc2Var = this.b;
                switch (b3) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        H0().f.u = new pjn(I0(), (byte) 13);
        final byte b3 = 4;
        H0().j.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b3;
                kc2 kc2Var = this.b;
                switch (b32) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        final byte b4 = 5;
        H0().e.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b4;
                kc2 kc2Var = this.b;
                switch (b32) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        final byte b5 = 6;
        H0().h.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b5;
                kc2 kc2Var = this.b;
                switch (b32) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        final byte b6 = 7;
        H0().m.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b6;
                kc2 kc2Var = this.b;
                switch (b32) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        final byte b7 = 8;
        H0().q.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b7;
                kc2 kc2Var = this.b;
                switch (b32) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        final byte b8 = 9;
        H0().r.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b8;
                kc2 kc2Var = this.b;
                switch (b32) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        final byte b9 = 10;
        H0().k.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b9;
                kc2 kc2Var = this.b;
                switch (b32) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        final byte b10 = 0;
        H0().l.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b10;
                kc2 kc2Var = this.b;
                switch (b32) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        final byte b11 = 1;
        H0().o.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b11;
                kc2 kc2Var = this.b;
                switch (b32) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        final byte b12 = 3;
        H0().n.setOnClickListener(new View.OnClickListener(this) { // from class: jc2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b12;
                kc2 kc2Var = this.b;
                switch (b32) {
                    case 0:
                        kc2Var.I0().getClass();
                        break;
                    case 1:
                        kc2Var.I0().getClass();
                        break;
                    case 2:
                        int i = AiAssistantAppWidget.b;
                        Context contextRequireContext = kc2Var.requireContext();
                        int i2 = eif.a;
                        kfo.c0(contextRequireContext.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(contextRequireContext), 2131559520);
                        break;
                    case 3:
                        kc2Var.I0().getClass();
                        break;
                    case 4:
                        kc2Var.t.a(2131365030);
                        break;
                    case 5:
                        kc2 kc2Var2 = this.b;
                        g0c g0cVar = kc2Var2.t;
                        q2 q2Var = new q2(0, kc2Var2, kc2.class, "onNavigateToSystemSpeechOutputSettingsError", "onNavigateToSystemSpeechOutputSettingsError()V", 0, (byte) 7);
                        fp1 fp1Var = g0cVar.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            q2Var.invoke();
                            return;
                        }
                    case 6:
                        FullscreenWebActivity.A0(((g8j) kc2Var.I0().c).a, "https://help.opera.com/en/browser-ai-faq/", new rxh(2132021212));
                        break;
                    case 7:
                        kc2Var.I0().getClass();
                        break;
                    case 8:
                        kc2Var.I0().getClass();
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kc2Var.I0().getClass();
                        break;
                    default:
                        kc2Var.I0().getClass();
                        break;
                }
            }
        });
        xf8.i0((ekc) ((zyk) I0().d.d).getValue(), getViewLifecycleOwner(), H0().a, (List) null, new pb(this, b));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.u;
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        itdVar.findItem(2131361875).setVisible(false);
    }
}
