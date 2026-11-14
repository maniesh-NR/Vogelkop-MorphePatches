package defpackage;

import android.content.res.Resources;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.uninstall.UninstallSurveyFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class glm implements f7f, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ glm(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final br9 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new nr9(1, (UninstallSurveyFragment) obj, UninstallSurveyFragment.class, "applyState", "applyState(Lcom/opera/android/uninstall/UninstallSurveyState;)V", 0);
            case 1:
                return (rg) obj;
            case 2:
                return (nfh) obj;
            case 3:
                return (x9e) obj;
            case 4:
                return (qfl) obj;
            default:
                return (q0n) obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, android.widget.TextView, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    public final void d0(Object obj) throws Resources.NotFoundException, cam {
        int i;
        AttributeSet attributeSet;
        ?? r2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                nlm nlmVar = (nlm) obj;
                UninstallSurveyFragment uninstallSurveyFragment = (UninstallSurveyFragment) obj2;
                pt1 pt1Var = uninstallSurveyFragment.s;
                AttributeSet attributeSet2 = null;
                if (pt1Var == null) {
                    pt1Var = null;
                }
                ?? r4 = (OperaMaterialButton) pt1Var.c;
                ViewStub viewStub = (ViewStub) pt1Var.b;
                vs vsVar = (vs) pt1Var.f;
                pxh pxhVar = nlmVar.d;
                boolean z = nlmVar.i;
                r4.setText(pxhVar.a(uninstallSurveyFragment.getResources()));
                r4.setEnabled(nlmVar.e);
                r4.R(z);
                pt1Var.g.setText(nlmVar.f.a(uninstallSurveyFragment.getResources()));
                boolean z2 = nlmVar.h;
                ConstraintLayout constraintLayout = vsVar.b;
                if (z2) {
                    constraintLayout.setVisibility(8);
                    if (viewStub.getParent() != null) {
                        viewStub.inflate();
                        return;
                    }
                    return;
                }
                constraintLayout.setVisibility(0);
                ((b7k) vsVar.e).b.setVisibility(nlmVar.a ? 0 : 8);
                vs vsVar2 = (vs) vsVar.d;
                r22 r22Var = nlmVar.b;
                boolean z3 = r22Var != null;
                LinearLayout linearLayout = (LinearLayout) vsVar2.b;
                b7k b7kVar = (b7k) vsVar2.d;
                FrameLayout frameLayout = (FrameLayout) b7kVar.b;
                ?? r14 = (LinearLayout) vsVar2.c;
                linearLayout.setVisibility(z3 ? 0 : 8);
                if (z3) {
                    TextView textView = (TextView) vsVar2.e;
                    rxh rxhVar = (rxh) r22Var.b;
                    klm klmVar = (klm) r22Var.a;
                    textView.setText(rxhVar.a(uninstallSurveyFragment.getResources()));
                    boolean zA = Intrinsics.a(r14.getTag(), klmVar.name());
                    if (!zA) {
                        r14.removeViews(0, r14.getChildCount() - 1);
                        r14.setTag(klmVar.name());
                    }
                    int iOrdinal = ((blm) r22Var.c).ordinal();
                    if (iOrdinal == 0) {
                        i = 2132085000;
                    } else {
                        if (iOrdinal != 1) {
                            h9o.p();
                            return;
                        }
                        i = 2132084980;
                    }
                    int i2 = 0;
                    for (Object obj3 : (List) r22Var.d) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            ?? r17 = attributeSet2;
                            j95.n();
                            throw r17;
                        }
                        dlm dlmVar = (dlm) obj3;
                        if (zA) {
                            attributeSet = attributeSet2;
                            r2 = (OperaListItem) r14.getChildAt(i2);
                        } else {
                            OperaListItem operaListItem = new OperaListItem(uninstallSurveyFragment.requireContext(), attributeSet2, i);
                            operaListItem.E(dlmVar.b);
                            attributeSet = attributeSet2;
                            operaListItem.u = new so4((Object) uninstallSurveyFragment, i2, (Object) dlmVar, (byte) 10);
                            r2 = operaListItem;
                        }
                        boolean zContains = nlmVar.c.contains(Integer.valueOf(i2));
                        if (zContains != r2.isChecked()) {
                            r2.setChecked(zContains);
                        }
                        r2.setEnabled(!z);
                        if (!zA) {
                            r14.addView(r2, r14.getChildCount() - 1);
                        }
                        i2 = i3;
                        attributeSet2 = attributeSet;
                    }
                    boolean z4 = UninstallSurveyFragment.H0(nlmVar) != null;
                    TextInputEditText textInputEditText = (OperaTextInputEditText) b7kVar.c;
                    if ((frameLayout.getVisibility() == 0) != z4) {
                        frameLayout.setVisibility(z4 ? 0 : 8);
                        if (z4) {
                            l5b l5bVar = q9n.c;
                            q9n.G(textInputEditText.getContext(), textInputEditText);
                        } else {
                            Editable text = textInputEditText.getText();
                            if (text != null) {
                                text.clear();
                            }
                        }
                    }
                    textInputEditText.setEnabled(!z);
                }
                ((TextView) vsVar.c).setVisibility(nlmVar.g ? 0 : 8);
                return;
            case 1:
                ((rg) obj2).invoke(obj);
                return;
            case 2:
                ((nfh) obj2).invoke(obj);
                return;
            case 3:
                ((x9e) obj2).invoke(obj);
                return;
            case 4:
                ((qfl) obj2).invoke(obj);
                return;
            default:
                ((q0n) obj2).invoke(obj);
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
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
}
