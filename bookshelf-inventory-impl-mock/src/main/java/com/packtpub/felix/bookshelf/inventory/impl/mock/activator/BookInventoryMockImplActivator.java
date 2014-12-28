package com.packtpub.felix.bookshelf.inventory.impl.mock.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.packtpub.felix.bookshelf.inventory.api.BookInventory;
import com.packtpub.felix.bookshelf.inventory.impl.mock.BookInventoryMockImpl;

public class BookInventoryMockImplActivator implements BundleActivator {

    private ServiceRegistration reg = null;
    public void start(BundleContext context) throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Starting BookInventory Impl Activator");
	
	this.reg = context.registerService(BookInventory.class.getName(), new BookInventoryMockImpl(), null);
	
	
    }

    public void stop(BundleContext context) throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Stopping BookInventory Impl Activator");
	context.ungetService(this.reg.getReference());
	this.reg = null;
    }

}
