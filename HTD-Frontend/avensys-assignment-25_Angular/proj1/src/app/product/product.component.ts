import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit{
  isAllowed = true;
  id: string | null = "";
  query: string | null = "";
  discount: string | null = "";
  order: string | null = "";
  allQuery: any = {};
  bike: String | null = "";
  car: String | null = "";
  bicycle: String | null = "";
  constructor(private route: ActivatedRoute, private router:Router) {}
  ngOnInit(): void {
    this.id = this.route.snapshot.params['id']; // snapshot is used if route does change dynamically

    // This is a snapshot and won't change if the route changes programmatically within is route
    console.log("Static Params: " + this.route.snapshot.params['id']);
    console.log("Static Query: " + this.route.snapshot.queryParams['page']); // object of all the query params

    // This is to handle the route change within the same route prgrammatically. E.g. router navigate
    this.route.params.subscribe((params) => {
      this.id = params['id'];
      this.discount = params['discount'];
      console.log("Dynamic Params: " + this.id);
      console.log("Dynamic Params discount: " + params['asking'])
    });
    this.route.queryParams.subscribe((query) => {
      this.query = query['page'];
      this.order = query['order'];
      this.allQuery = query;
      console.log("Dynamic Query: " + query['page']);
    })

    this.route.queryParams.subscribe((query) => {
      this.bike = query['bike'];
      this.bicycle = query['bicycle'];
      this.car = query['car'];
    })
  }

  queryMe () {
    this.router.navigate(['products', 3, 'discount', 0.3], {queryParams: {page: 3, order: 'newest'}});
  }


}
