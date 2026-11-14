package com.leanplum.messagetemplates;

import com.leanplum.ActionContext;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.messagetemplates.actions.OpenUrlAction;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u000b"}, d2 = {"Lcom/leanplum/messagetemplates/OperaOpenUrlAction;", "Lcom/leanplum/messagetemplates/actions/OpenUrlAction;", "actionCallbacks", "", "Lcom/leanplum/callbacks/ActionCallback;", "<init>", "(Ljava/util/List;)V", "handleAction", "", "actionContext", "Lcom/leanplum/ActionContext;", "app", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaOpenUrlAction extends OpenUrlAction {
    public static final int $stable = 8;

    @NotNull
    private final List<ActionCallback> actionCallbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public OperaOpenUrlAction(@NotNull List<? extends ActionCallback> list) {
        this.actionCallbacks = list;
    }

    @Override // com.leanplum.messagetemplates.actions.OpenUrlAction, com.leanplum.messagetemplates.MessageTemplate
    public void handleAction(@NotNull ActionContext actionContext) {
        Iterator<ActionCallback> it = this.actionCallbacks.iterator();
        while (it.hasNext()) {
            if (it.next().onResponse(actionContext)) {
                return;
            }
        }
        super.handleAction(actionContext);
    }
}
