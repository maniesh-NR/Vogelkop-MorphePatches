package defpackage;

import J.N;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.w;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;

/* loaded from: classes.dex */
public final class f0i extends o1e {
    public final db f;
    public y83 g;
    public Button h;
    public final PasswordManager i;
    public byte j;
    public final l31 k;

    public f0i(db dbVar, PasswordManager passwordManager, l31 l31Var) {
        this.i = passwordManager;
        this.f = dbVar;
        this.k = l31Var;
    }

    @Override // defpackage.uim
    public final Dialog g0(Bundle bundle) {
        return new v48(this, getContext(), (byte) 1);
    }

    @Override // defpackage.o1e
    public final void i0() {
        if (this.f.f()) {
            o0(3);
        } else {
            o0(2);
        }
    }

    @Override // defpackage.o1e
    public final void j0() {
        super.j0();
        if (this.f.f()) {
            o0(1);
        } else {
            o0(2);
        }
    }

    @Override // defpackage.o1e
    public final void l0(String str) {
        y83 y83Var = this.g;
        if (y83Var != null) {
            ((TextInputLayout) y83Var.f).p(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(int i) {
        y83 y83Var;
        if (this.j == i || this.h == null || (y83Var = this.g) == null) {
            return;
        }
        this.j = i;
        ((OperaIconedMessage) y83Var.h).setVisibility(8);
        ((StylingTextView) this.g.c).setVisibility(8);
        byte b = this.j;
        final byte b2 = 0;
        if (b != 0) {
            final byte b3 = 1;
            if (b != 1) {
                final byte b4 = 2;
                if (b != 2) {
                    if (b == 3) {
                        this.h.setText(2132020912);
                        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: d0i
                            public final /* synthetic */ f0i b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b5 = b4;
                                f0i f0iVar = this.b;
                                switch (b5) {
                                    case 0:
                                        f0iVar.m0(aik.c(((OperaTextInputEditText) f0iVar.g.e).getText()));
                                        break;
                                    case 1:
                                        f0iVar.h0();
                                        w fragmentManager = f0iVar.getFragmentManager();
                                        if (fragmentManager != null) {
                                            jh0 jh0VarB = f0iVar.f.b();
                                            if (!(jh0VarB == jh0.e ? f0iVar.p0(fragmentManager, "facebook") : jh0VarB == jh0.f ? f0iVar.p0(fragmentManager, "google") : jh0VarB == jh0.g ? f0iVar.p0(fragmentManager, "twitter") : jh0VarB == jh0.h ? f0iVar.p0(fragmentManager, "vk") : false)) {
                                                xih.u(fragmentManager);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        pjg pjgVar = new pjg(f0iVar, (byte) 22);
                                        if (!f0iVar.e) {
                                            ProgressDialog progressDialog = f0iVar.d;
                                            if (progressDialog == null) {
                                                progressDialog = new ProgressDialog(f0iVar.getContext());
                                                f0iVar.d = progressDialog;
                                            }
                                            progressDialog.show();
                                        }
                                        dxk dxkVar = f0iVar.getActivity().U;
                                        if (dxkVar == null) {
                                            dxkVar = null;
                                        }
                                        hu5 hu5Var = new hu5(f0iVar, pjgVar, (byte) 23);
                                        dxkVar.getClass();
                                        new isd((String) N.MfdQn0dE(), new eof(dxkVar, hu5Var, (byte) 26));
                                        break;
                                }
                            }
                        });
                        ((StylingTextView) this.g.c).setText(2132020913);
                        ((StylingTextView) this.g.c).setVisibility(0);
                        ((OperaIconedMessage) this.g.h).setVisibility(0);
                        return;
                    }
                    if (b != 4) {
                        return;
                    }
                }
                this.h.setText(2132019560);
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: d0i
                    public final /* synthetic */ f0i b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b5 = b3;
                        f0i f0iVar = this.b;
                        switch (b5) {
                            case 0:
                                f0iVar.m0(aik.c(((OperaTextInputEditText) f0iVar.g.e).getText()));
                                break;
                            case 1:
                                f0iVar.h0();
                                w fragmentManager = f0iVar.getFragmentManager();
                                if (fragmentManager != null) {
                                    jh0 jh0VarB = f0iVar.f.b();
                                    if (!(jh0VarB == jh0.e ? f0iVar.p0(fragmentManager, "facebook") : jh0VarB == jh0.f ? f0iVar.p0(fragmentManager, "google") : jh0VarB == jh0.g ? f0iVar.p0(fragmentManager, "twitter") : jh0VarB == jh0.h ? f0iVar.p0(fragmentManager, "vk") : false)) {
                                        xih.u(fragmentManager);
                                        break;
                                    }
                                }
                                break;
                            default:
                                pjg pjgVar = new pjg(f0iVar, (byte) 22);
                                if (!f0iVar.e) {
                                    ProgressDialog progressDialog = f0iVar.d;
                                    if (progressDialog == null) {
                                        progressDialog = new ProgressDialog(f0iVar.getContext());
                                        f0iVar.d = progressDialog;
                                    }
                                    progressDialog.show();
                                }
                                dxk dxkVar = f0iVar.getActivity().U;
                                if (dxkVar == null) {
                                    dxkVar = null;
                                }
                                hu5 hu5Var = new hu5(f0iVar, pjgVar, (byte) 23);
                                dxkVar.getClass();
                                new isd((String) N.MfdQn0dE(), new eof(dxkVar, hu5Var, (byte) 26));
                                break;
                        }
                    }
                });
                ((StylingTextView) this.g.c).setText(this.j == 2 ? 2132021761 : 2132021760);
                ((StylingTextView) this.g.c).setVisibility(0);
                return;
            }
        }
        this.h.setText(2132019560);
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: d0i
            public final /* synthetic */ f0i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b2;
                f0i f0iVar = this.b;
                switch (b5) {
                    case 0:
                        f0iVar.m0(aik.c(((OperaTextInputEditText) f0iVar.g.e).getText()));
                        break;
                    case 1:
                        f0iVar.h0();
                        w fragmentManager = f0iVar.getFragmentManager();
                        if (fragmentManager != null) {
                            jh0 jh0VarB = f0iVar.f.b();
                            if (!(jh0VarB == jh0.e ? f0iVar.p0(fragmentManager, "facebook") : jh0VarB == jh0.f ? f0iVar.p0(fragmentManager, "google") : jh0VarB == jh0.g ? f0iVar.p0(fragmentManager, "twitter") : jh0VarB == jh0.h ? f0iVar.p0(fragmentManager, "vk") : false)) {
                                xih.u(fragmentManager);
                                break;
                            }
                        }
                        break;
                    default:
                        pjg pjgVar = new pjg(f0iVar, (byte) 22);
                        if (!f0iVar.e) {
                            ProgressDialog progressDialog = f0iVar.d;
                            if (progressDialog == null) {
                                progressDialog = new ProgressDialog(f0iVar.getContext());
                                f0iVar.d = progressDialog;
                            }
                            progressDialog.show();
                        }
                        dxk dxkVar = f0iVar.getActivity().U;
                        if (dxkVar == null) {
                            dxkVar = null;
                        }
                        hu5 hu5Var = new hu5(f0iVar, pjgVar, (byte) 23);
                        dxkVar.getClass();
                        new isd((String) N.MfdQn0dE(), new eof(dxkVar, hu5Var, (byte) 26));
                        break;
                }
            }
        });
    }

    public final boolean p0(w wVar, String str) {
        return this.f.k(getActivity(), str, new zzh(wVar, (byte) 1), null);
    }
}
