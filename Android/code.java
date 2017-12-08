String ph = phone.getText().toString();
                String pw = password.getText().toString();

                    parameters = new HashMap<String, String>();
                    parameters.put("phone", ph);
                    parameters.put("password",pw);
                    RequestQueue mrequestqueue= Volley.newRequestQueue(getApplicationContext());
                    Log.v("Param",parameters.toString());
                    StringRequest stringRequest = new StringRequest(url + "?ph=" + parameters.get("phone")+"&pw="+parameters.get("password"), new Response.Listener<String>() {
                        @Override
                        public void onResponse(String s) {
                            Log.v("String Response",s.toString());
                            Toast.makeText(CustomerLogin.this, "Login Success for "+s.toString(), Toast.LENGTH_SHORT).show();

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError volleyError) {
                            Log.v("Error Response",volleyError.toString());
                        }
                    });
                    mrequestqueue.add(stringRequest);
