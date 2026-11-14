package defpackage;

import J.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import org.chromium.content.browser.HostZoomMapImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class ywf extends dej {
    public final k6l c;
    public final SettingsManager d;
    public final d8j e;
    public y83 f;
    public boolean g;

    public ywf(mej mejVar, k6l k6lVar, SettingsManager settingsManager, d8j d8jVar) {
        super(mejVar);
        this.c = k6lVar;
        this.d = settingsManager;
        this.e = d8jVar;
    }

    @Override // defpackage.dej
    public final View a(Context context) {
        double dPow;
        final byte b = 0;
        View viewInflate = LayoutInflater.from(context).inflate(2131559202, (ViewGroup) null, false);
        int i = 2131363837;
        OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131363837, viewInflate);
        if (operaMaterialButton != null) {
            i = 2131363838;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363838, viewInflate);
            if (stylingTextView != null) {
                i = 2131363839;
                MaterialButton materialButton = (OperaMaterialButton) w1h.j(2131363839, viewInflate);
                if (materialButton != null) {
                    i = 2131363840;
                    AppCompatImageView appCompatImageView = (StylingImageButton) w1h.j(2131363840, viewInflate);
                    if (appCompatImageView != null) {
                        i = 2131363841;
                        Slider sliderJ = w1h.j(2131363841, viewInflate);
                        if (sliderJ != null) {
                            i = 2131363842;
                            ConstraintLayout constraintLayout = (OperaListItem) w1h.j(2131363842, viewInflate);
                            if (constraintLayout != null) {
                                this.f = new y83((ViewGroup) viewInflate, (Object) operaMaterialButton, (Object) stylingTextView, (View) materialButton, (View) appCompatImageView, (Object) sliderJ, (View) constraintLayout, (byte) 7);
                                final byte b2 = 1;
                                sliderJ.t0(new m9(this, (byte) 1));
                                y83 y83Var = this.f;
                                if (y83Var == null) {
                                    y83Var = null;
                                }
                                ((OperaMaterialButton) y83Var.e).setOnClickListener(new View.OnClickListener(this) { // from class: xwf
                                    public final /* synthetic */ ywf b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b3 = b;
                                        ywf ywfVar = this.b;
                                        switch (b3) {
                                            case 0:
                                                SettingsManager settingsManager = ywfVar.d;
                                                int iN = settingsManager.n("default_webpage_zoom");
                                                ywfVar.d(oup.n0(iN));
                                                ywfVar.g = true;
                                                y83 y83Var2 = ywfVar.f;
                                                if (y83Var2 == null) {
                                                    y83Var2 = null;
                                                }
                                                ((Slider) y83Var2.g).C0(iN);
                                                ywfVar.g = false;
                                                if (ywfVar.g()) {
                                                    settingsManager.V(-1, "reader_mode_text_wrap");
                                                } else {
                                                    String strE = ywfVar.e();
                                                    if (strE != null) {
                                                        N.M3MkeCX1(strE);
                                                    }
                                                }
                                                y83 y83Var3 = ywfVar.f;
                                                ((OperaListItem) (y83Var3 != null ? y83Var3 : null).h).t(settingsManager.i("text_wrap"));
                                                ywfVar.h();
                                                ywfVar.k(iN);
                                                ywfVar.j(iN);
                                                break;
                                            case 1:
                                                ywfVar.b();
                                                ((g8j) ywfVar.e).a(new int[0]);
                                                break;
                                            default:
                                                ywfVar.b();
                                                break;
                                        }
                                    }
                                });
                                y83 y83Var2 = this.f;
                                if (y83Var2 == null) {
                                    y83Var2 = null;
                                }
                                ((OperaListItem) y83Var2.h).t(f());
                                y83 y83Var3 = this.f;
                                ((OperaListItem) (y83Var3 == null ? null : y83Var3).h).u = new kqd(this, (byte) 25);
                                if (y83Var3 == null) {
                                    y83Var3 = null;
                                }
                                ((StylingImageButton) y83Var3.f).setOnClickListener(new View.OnClickListener(this) { // from class: xwf
                                    public final /* synthetic */ ywf b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b3 = b2;
                                        ywf ywfVar = this.b;
                                        switch (b3) {
                                            case 0:
                                                SettingsManager settingsManager = ywfVar.d;
                                                int iN = settingsManager.n("default_webpage_zoom");
                                                ywfVar.d(oup.n0(iN));
                                                ywfVar.g = true;
                                                y83 y83Var22 = ywfVar.f;
                                                if (y83Var22 == null) {
                                                    y83Var22 = null;
                                                }
                                                ((Slider) y83Var22.g).C0(iN);
                                                ywfVar.g = false;
                                                if (ywfVar.g()) {
                                                    settingsManager.V(-1, "reader_mode_text_wrap");
                                                } else {
                                                    String strE = ywfVar.e();
                                                    if (strE != null) {
                                                        N.M3MkeCX1(strE);
                                                    }
                                                }
                                                y83 y83Var32 = ywfVar.f;
                                                ((OperaListItem) (y83Var32 != null ? y83Var32 : null).h).t(settingsManager.i("text_wrap"));
                                                ywfVar.h();
                                                ywfVar.k(iN);
                                                ywfVar.j(iN);
                                                break;
                                            case 1:
                                                ywfVar.b();
                                                ((g8j) ywfVar.e).a(new int[0]);
                                                break;
                                            default:
                                                ywfVar.b();
                                                break;
                                        }
                                    }
                                });
                                y83 y83Var4 = this.f;
                                if (y83Var4 == null) {
                                    y83Var4 = null;
                                }
                                final byte b3 = 2;
                                ((OperaMaterialButton) y83Var4.c).setOnClickListener(new View.OnClickListener(this) { // from class: xwf
                                    public final /* synthetic */ ywf b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b32 = b3;
                                        ywf ywfVar = this.b;
                                        switch (b32) {
                                            case 0:
                                                SettingsManager settingsManager = ywfVar.d;
                                                int iN = settingsManager.n("default_webpage_zoom");
                                                ywfVar.d(oup.n0(iN));
                                                ywfVar.g = true;
                                                y83 y83Var22 = ywfVar.f;
                                                if (y83Var22 == null) {
                                                    y83Var22 = null;
                                                }
                                                ((Slider) y83Var22.g).C0(iN);
                                                ywfVar.g = false;
                                                if (ywfVar.g()) {
                                                    settingsManager.V(-1, "reader_mode_text_wrap");
                                                } else {
                                                    String strE = ywfVar.e();
                                                    if (strE != null) {
                                                        N.M3MkeCX1(strE);
                                                    }
                                                }
                                                y83 y83Var32 = ywfVar.f;
                                                ((OperaListItem) (y83Var32 != null ? y83Var32 : null).h).t(settingsManager.i("text_wrap"));
                                                ywfVar.h();
                                                ywfVar.k(iN);
                                                ywfVar.j(iN);
                                                break;
                                            case 1:
                                                ywfVar.b();
                                                ((g8j) ywfVar.e).a(new int[0]);
                                                break;
                                            default:
                                                ywfVar.b();
                                                break;
                                        }
                                    }
                                });
                                b2l b2lVar = this.c.o;
                                if (b2lVar != null) {
                                    uy3 uy3VarF = uy3.F(b2lVar);
                                    ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
                                    if (chromiumContent != null) {
                                        WebContents webContentsE = chromiumContent.e();
                                        if (!webContentsE.isDestroyed()) {
                                            long j = chromiumContent.a;
                                            if (j != 0) {
                                                N.MZxYYnZG(j, 1.0f);
                                            }
                                            if (g()) {
                                                SettingsManager settingsManager = this.d;
                                                Integer readerModeZoomLevel = settingsManager.getReaderModeZoomLevel();
                                                dPow = readerModeZoomLevel != null ? readerModeZoomLevel.intValue() : settingsManager.n("default_webpage_zoom");
                                            } else {
                                                dPow = Math.pow(1.2000000476837158d, HostZoomMapImpl.a(N.M70wUYPG(webContentsE))) * 100.0d;
                                            }
                                            int iRound = (int) (Math.round(dPow / 5.0d) * 5);
                                            this.g = true;
                                            y83 y83Var5 = this.f;
                                            if (y83Var5 == null) {
                                                y83Var5 = null;
                                            }
                                            ((Slider) y83Var5.g).C0(iRound);
                                            this.g = false;
                                            k(iRound);
                                            j(iRound);
                                        }
                                    }
                                }
                                y83 y83Var6 = this.f;
                                return (LinearLayout) (y83Var6 != null ? y83Var6 : null).b;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void d(double d) {
        b2l b2lVar = this.c.o;
        if (b2lVar != null) {
            uy3 uy3VarF = uy3.F(b2lVar);
            ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
            if (chromiumContent != null) {
                if (!g()) {
                    WebContents webContentsE = chromiumContent.e();
                    if (webContentsE.isDestroyed()) {
                        return;
                    }
                    N.MItN0bQy(webContentsE, d, HostZoomMapImpl.a(d));
                    return;
                }
                int iPow = (int) (Math.pow(1.2000000476837158d, d) * 100.0d);
                SettingsManager settingsManager = this.d;
                Integer numValueOf = iPow != settingsManager.n("default_webpage_zoom") ? Integer.valueOf(iPow) : null;
                settingsManager.V(numValueOf == null ? -1 : numValueOf.intValue(), "reader_mode_zoom_level");
                long j = chromiumContent.a;
                if (j != 0) {
                    N.MlSk$KdJ(j);
                }
            }
        }
    }

    public final String e() {
        b2l b2lVar = this.c.o;
        if (b2lVar == null) {
            return null;
        }
        uy3 uy3VarF = uy3.F(b2lVar);
        ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
        if (chromiumContent == null || chromiumContent.e().isDestroyed()) {
            return null;
        }
        return chromiumContent.r();
    }

    public final boolean f() {
        Boolean readerModeTextWrap;
        boolean zG = g();
        SettingsManager settingsManager = this.d;
        if (zG) {
            readerModeTextWrap = settingsManager.getReaderModeTextWrap();
        } else {
            String strE = e();
            readerModeTextWrap = strE == null ? null : (Boolean) N.MzJrTmZH(strE);
        }
        return readerModeTextWrap != null ? readerModeTextWrap.booleanValue() : settingsManager.i("text_wrap");
    }

    public final boolean g() {
        b2l b2lVar = this.c.o;
        if (b2lVar == null) {
            return false;
        }
        uy3 uy3VarF = uy3.F(b2lVar);
        ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
        if (chromiumContent == null) {
            return false;
        }
        return chromiumContent.g;
    }

    public final void h() {
        b2l b2lVar = this.c.o;
        if (b2lVar != null) {
            uy3 uy3VarF = uy3.F(b2lVar);
            ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
            if (chromiumContent != null) {
                WebContents webContentsE = chromiumContent.e();
                if (webContentsE.isDestroyed()) {
                    return;
                }
                webContentsE.V();
            }
        }
    }

    public final void j(int i) {
        SettingsManager settingsManager = this.d;
        boolean z = i != settingsManager.n("default_webpage_zoom");
        boolean z2 = f() != settingsManager.i("text_wrap");
        y83 y83Var = this.f;
        if (y83Var == null) {
            y83Var = null;
        }
        ((OperaMaterialButton) y83Var.e).setEnabled(z || z2);
    }

    public final void k(int i) {
        y83 y83Var = this.f;
        if (y83Var == null) {
            y83Var = null;
        }
        ((StylingTextView) y83Var.d).setText(i + "%");
    }
}
