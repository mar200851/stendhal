/* $Id$ */
/***************************************************************************
 *                      (C) Copyright 2003 - Marauroa                      *
 ***************************************************************************
 ***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/
package games.stendhal.client.entity;

import marauroa.common.game.*;
import games.stendhal.client.*;
import java.awt.*;
import java.awt.geom.*;

public class Item extends PassiveEntity 
  {
  private String type;
  
  public Item(GameObjects gameObjects, RPObject object) throws AttributeNotFoundException
    {    
    super(gameObjects, object);
    type=object.get("class");
    }

  protected void loadSprite(RPObject object)
    {
    SpriteStore store=SpriteStore.get();        
    sprite=store.getSprite("sprites/"+object.get("class")+".png");
    }


  public Rectangle2D getArea()
    {
    return new Rectangle.Double(x,y,1,1);
    }
    
  public Rectangle2D getDrawedArea()
    {
    return new Rectangle.Double(x,y,1,1);
    }  
    
  public String defaultAction()
    {
    return "Look";
    }

  public String[] offeredActions()
    {
    String[] list={"Look"};
    return list;
    }

  public void onAction(StendhalClient client, String action, String... params)
    {
    if(action.equals("Look"))
      {
      StendhalClient.get().addEventLine("You see a "+type,Color.green);
      }
    else
      {
      super.onAction(client,action,params);
      }
    }

  public int compare(Entity entity)
    {
    if(entity instanceof RPEntity)
      {
      return -1;
      }
      
    return 1;
    }
  }
