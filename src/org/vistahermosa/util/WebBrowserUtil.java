/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vistahermosa.util;

//import chrriis.dj.nativeswing.swtimpl.NativeInterface;
//import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import com.sun.javafx.application.PlatformImpl;
import java.awt.GridLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class WebBrowserUtil
{
  
  public static void closeWebBrowsers()
  {
    PlatformImpl.exit();
    //NativeInterface.close();
  }
  private WebView myBrowser;
  private Stage stage;
  private JPanel thisPanel;
  private WebBrowserComponentListener thisListener;
  
  public void getNewBrowser(final String urlString, final JPanel thisPanel)
  {
    PlatformImpl.startup(new Runnable()
    {
      @Override
      public void run()
      {
        if(thisListener == null)
        {
          thisListener = new WebBrowserComponentListener();
        }
        else
        {
          thisPanel.removeComponentListener(thisListener);
        }
        
        thisPanel.addComponentListener(thisListener);
        WebBrowserUtil.this.thisPanel = thisPanel;
        stage = new Stage();
        JFXPanel webPanel = new JFXPanel();
        Group root = new Group();
        myBrowser = new WebView();
        
        URI uri = URI.create(urlString);
        Map<String, List<String>> headers = new LinkedHashMap<>();
        headers.put("Set-Cookie", Arrays.asList("name=value"));

        try
        {
          java.net.CookieHandler.getDefault().put(uri, headers);
        }catch(IOException e){}
        
        Scene scene = new Scene(root, thisPanel.getWidth(), thisPanel.getHeight());
        WebEngine webEngine = myBrowser.getEngine();
        webEngine.setJavaScriptEnabled(true);

        ObservableList<Node> children = root.getChildren();
        children.add(myBrowser);

        thisPanel.removeAll();
        thisPanel.setLayout(new GridLayout(1, 1));
        thisPanel.add(webPanel);
        thisPanel.updateUI();
        myBrowser.autosize();
        myBrowser.setMinSize(thisPanel.getWidth(), thisPanel.getHeight());
        myBrowser.setMaxSize(thisPanel.getWidth(), thisPanel.getHeight());
        myBrowser.setPrefSize(thisPanel.getWidth(), thisPanel.getHeight());

        stage.setMinWidth(thisPanel.getWidth());
        stage.setMinHeight(thisPanel.getHeight());
        stage.setMaxWidth(thisPanel.getWidth());
        stage.setMaxHeight(thisPanel.getHeight());
        stage.setWidth(thisPanel.getWidth());
        stage.setHeight(thisPanel.getHeight());
        stage.setFullScreen(true);
        stage.setTitle("");
        stage.setResizable(true);
        stage.setScene(scene);

        webEngine.load(urlString);
        webPanel.setScene(scene);

      }
    });

    /*IBrowserCanvas browser1 = BrowserFactory.spawnMozilla();
    thisPanel.removeAll();
    thisPanel.setLayout(new GridLayout(1,1));
    thisPanel.add(browser1.getComponent());
    thisPanel.updateUI();
    browser1.loadURL(urlString);*/
    
    /*if(NativeInterface.isInitialized())
    {
    JWebBrowser webBrowser = new JWebBrowser();
    webBrowser.navigate(urlString);
    webBrowser.setMenuBarVisible(false);
    webBrowser.setLocationBarVisible(false);
    webBrowser.setButtonBarVisible(false);
    thisPanel.removeAll();
    thisPanel.setLayout(new GridLayout(1,1));
    thisPanel.add(webBrowser);
    thisPanel.updateUI();
    }*/
  }
  
  private class WebBrowserComponentListener implements ComponentListener
  {

    @Override
    public void componentResized(ComponentEvent e)
    {
      if(thisPanel != null)
      {
        thisPanel.updateUI();
      }
      
      if(myBrowser != null)
      {
        myBrowser.autosize();
        myBrowser.setMinSize(thisPanel.getWidth(), thisPanel.getHeight());
        myBrowser.setMaxSize(thisPanel.getWidth(), thisPanel.getHeight());
        myBrowser.setPrefSize(thisPanel.getWidth(), thisPanel.getHeight());
      }

      if(stage != null)
      {
        stage.setMinWidth(thisPanel.getWidth());
        stage.setMinHeight(thisPanel.getHeight());
        stage.setMaxWidth(thisPanel.getWidth());
        stage.setMaxHeight(thisPanel.getHeight());
        stage.setWidth(thisPanel.getWidth());
        stage.setHeight(thisPanel.getHeight());
      }
    }

    @Override
    public void componentMoved(ComponentEvent e)
    {
      
    }

    @Override
    public void componentShown(ComponentEvent e)
    {
      
    }

    @Override
    public void componentHidden(ComponentEvent e)
    {
      
    }
    
  }
}
