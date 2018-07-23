package s4.gwt.starter.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Starter implements EntryPoint {
    @Override
    public void onModuleLoad() {
        RootPanel.get("main").add(new Label("Hello"));
    }
}
