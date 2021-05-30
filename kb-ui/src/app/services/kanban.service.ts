import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class KanbanService {

  backendURL = environment.backendURL;
  constructor(private http: HttpClient) { }

  getKanbans = (): Observable<any>=>{

    return this.http.get<any>(this.backendURL+'/kanban/');
  }

  getKanbanById = (id:any):Observable<any> => {
    return this.http.get<any>(this.backendURL+'/kanban/'+id);
  }
}
