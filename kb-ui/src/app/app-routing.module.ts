import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { KanbanboardComponent } from './components/kanbanboard/kanbanboard.component';

const routes: Routes = [
  { path: '/', component: DashboardComponent },
  { path: '/kanban', component: KanbanboardComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
