import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { KanbanComponent } from './services/kanban/kanban.component';
import { KanbanDialogComponent } from './components/kanban-dialog/kanban-dialog.component';
import { TaskDialogComponent } from './components/task-dialog/task-dialog.component';
import { KanbanboardComponent } from './components/kanbanboard/kanbanboard.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    KanbanComponent,
    KanbanDialogComponent,
    TaskDialogComponent,
    KanbanboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
