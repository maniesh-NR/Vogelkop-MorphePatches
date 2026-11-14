package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.opera.android.custom_views.OperaRadioGroup;
import com.opera.android.custom_views.RadioButton;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class wx4 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ byte a;
    public ViewGroup.OnHierarchyChangeListener b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ wx4(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.c = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        byte b = this.a;
        ViewGroup viewGroup = this.c;
        switch (b) {
            case 0:
                ChipGroup chipGroup = (ChipGroup) viewGroup;
                if (view == chipGroup && (view2 instanceof Chip)) {
                    if (view2.getId() == -1) {
                        view2.setId(View.generateViewId());
                    }
                    ev4 ev4Var = chipGroup.h;
                    Chip chip = (Chip) view2;
                    ((HashMap) ev4Var.d).put(Integer.valueOf(chip.getId()), chip);
                    if (chip.isChecked()) {
                        ev4Var.c(chip);
                    }
                    chip.j = new tw2((Object) ev4Var, (byte) 17);
                }
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.b;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    break;
                }
                break;
            default:
                OperaRadioGroup operaRadioGroup = (OperaRadioGroup) viewGroup;
                yhe yheVar = operaRadioGroup.e;
                if (view == operaRadioGroup) {
                    if (view2.getId() == -1) {
                        view2.setId(View.generateViewId());
                    }
                    if (view2 instanceof RadioButton) {
                        ((RadioButton) view2).m = yheVar;
                    } else if (view2 instanceof OperaListItem) {
                        ((OperaListItem) view2).u = yheVar;
                    }
                }
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2 = this.b;
                if (onHierarchyChangeListener2 != null) {
                    onHierarchyChangeListener2.onChildViewAdded(view, view2);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        byte b = this.a;
        ViewGroup viewGroup = this.c;
        switch (b) {
            case 0:
                ChipGroup chipGroup = (ChipGroup) viewGroup;
                if (view == chipGroup && (view2 instanceof Chip)) {
                    ev4 ev4Var = chipGroup.h;
                    Chip chip = (Chip) view2;
                    ev4Var.getClass();
                    chip.j = null;
                    ((HashMap) ev4Var.d).remove(Integer.valueOf(chip.getId()));
                    ((HashSet) ev4Var.e).remove(Integer.valueOf(chip.getId()));
                }
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.b;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    break;
                }
                break;
            default:
                if (view == ((OperaRadioGroup) viewGroup)) {
                    if (view2 instanceof RadioButton) {
                        ((RadioButton) view2).m = null;
                    } else if (view2 instanceof OperaListItem) {
                        ((OperaListItem) view2).u = null;
                    }
                }
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2 = this.b;
                if (onHierarchyChangeListener2 != null) {
                    onHierarchyChangeListener2.onChildViewRemoved(view, view2);
                    break;
                }
                break;
        }
    }
}
