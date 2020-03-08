package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class Specilist_Doctor extends AppCompatActivity {
    String [] Doctor_name;
    int[]images={R.drawable.neuromedicinespecialist,R.drawable.medicine,R.drawable.cardiovascular,
    R.drawable.chest,R.drawable.pediatricsurgery,R.drawable.dental,R.drawable.diabetes,R.drawable.ent,
    R.drawable.ophthalmology,R.drawable.gastroenterology,R.drawable.gynecologyobstetrics,
    R.drawable.kidneyspecilist,R.drawable.cardiology,R.drawable.orthopaedics,R.drawable.radiotherapy,
    R.drawable.urology};
     RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specilist__doctor);

        getSupportActionBar().setTitle("Specilist Doctor");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Doctor_name=getResources().getStringArray(R.array.Doctor_name);

        recyclerView = (RecyclerView) findViewById(R.id.Recyclerview_Show);

        final cutomAdapter sAdapter=new cutomAdapter(Specilist_Doctor.this,Doctor_name,images);

        recyclerView.setAdapter(sAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sAdapter.setOnItemClickLisitiner(new cutomAdapter.Clicklisitiner() {
          @Override
          public void OnItemClick(int positon, View view) {
              String name=Doctor_name[positon];

             // Toast.makeText(Specilist_Doctor.this, "Position :"+name, Toast.LENGTH_SHORT).show();

              //Neuromedicne
              if(positon==0){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. Mansur Habib","Professor Dr. Md. Abdul Hai"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, FCPS (Medicine) , MD (Neurology) MRCP, FRCP","MBBS, FCPS (Medicine),MD (Neuro),PhD (India), FRCP (Edin),Fellow (Interventional Neurology)"});
                  bundle.putStringArray("Expertise",new String[]{"Neuromedicine","Neuromedicine"});
                  bundle.putStringArray("Instituaton",new String[]{"Dhaka Medical College and Hospital","Sir Salimullah Medical College and Mitford Hospital"});


                  bundle.putStringArray("champer",new String[]{"Labaid Cardiac Hospital","Ibn Sina Diagnostic & Imaging Center"});
                  bundle.putStringArray("Phone",new String[] {"028610793","0171735163"});
                  bundle.putString("data",name);

                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Medicine
              if(positon==1){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. (Rtd) N.I. Khan","Professor Dr. Fazlul Hoque"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, MRCP(U.K), FRCP, FACP(USA)","MBBS, FCPS, FRCP ( Edinburgh ), FRCP ( Glasgow ),FACP ( USA ), FCPS ( Pak )"});
                  bundle.putStringArray("Expertise",new String[]{"Medicine","Medicine"});
                  bundle.putStringArray("Instituaton",new String[]{"Dhaka Medical College and Hospital","Dhaka Medical College and Hospital "});



                  bundle.putStringArray("champer",new String[]{"Monowara Hospital (pvt) Ltd","Northern International Medical College & Hospital"});
                  bundle.putStringArray("Phone",new String[]{"028318135","0167405843"});


                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Cardiovascular & Thoracic Surgeon
              if(positon==2){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. Mahbubur Rahman","Dr. G.M. Mokbul Hossain"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, Phd, FICA(USA)","MBBS, MS"});
                  bundle.putStringArray("Expertise",new String[]{"Cardiovascular & Thoracic Surgeon","Cardiovascular & Thoracic Surgeon"});
                  bundle.putStringArray("Instituaton",new String[]{"Bangabandhu Sheikh Mujib Medical University","Ibn Sina Medical Imaging Center"});


                  bundle.putStringArray("champer",new String[]{"Dhaka,Bangladesh","Dhaka,Bangladesh"});
                  bundle.putStringArray("Phone",new String[]{"028611213","028610420"});

                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Chest Specialist Doctor
              if(positon==3){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. Mirza Mohammad Hiron","Professor Dr. AKM Mosharraf Hossain"});
                  bundle.putStringArray("designaiton",new String[]{"FCPS ( medicine ), MD ( Chest ), FCCP ( USA ), FRCP ( Ireland ), FRCP ( Edin ), FRCP ( Glasgow ), Phd, FICA(USA)","FCPS ( medicine ), MD ( Chest ), FCCP ( USA ), FRCP ( Ireland ), FRCP ( Edin ), FRCP ( Glasgow )"});
                  bundle.putStringArray("Expertise",new String[]{"Medcine & Pulmonology","Medcine & Pulmonology"});
                  bundle.putStringArray("Instituaton",new String[]{"Professor & Director, Respiratory Medicine","Professor & Director, Respiratory Medicine"});



                  bundle.putStringArray("champer",new String[]{"Dhaka,Bangladesh","Dhaka,Bangladesh"});
                  bundle.putStringArray("Phone",new String[]{"01717351631","01717351631"});

                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Child/Pediatric Surgery Specialist Doctor
              if(positon==4){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. Md. Shahid Karim","Professor Dr. Md. Mahbub - Ul - Alam"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, FCPS, FICS (USA)","MBBS, FCPS ( Surgery ), FICS"});
                  bundle.putStringArray("Expertise",new String[]{"Pediatric Surgeon","Pediatric Surgeon"});
                  bundle.putStringArray("Instituaton",new String[]{"Apollo Hospitals Dhaka","Dhaka Medical College & Hospital"});



                  bundle.putStringArray("champer",new String[]{"Apollo Hospitals Dhaka","Anwer Khan Modern Hospital Ltd"});
                  bundle.putStringArray("Phone",new String[]{"028401661","02967029"});


                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }


              //Dental & Maxillofacial Surgeon Specialist
              if(positon==5){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. Md. Golam Kibria","Dr. Motiur Rahman Molla"});
                  bundle.putStringArray("designaiton",new String[]{"B.D.S","BDS, FCPS (Hons),Post Graduate Diploma (Japan),PhD (Japan)"});
                  bundle.putStringArray("Expertise",new String[]{"Oral & Dental Surgeon","Oral & Maxillofacial Surgeon"});
                  bundle.putStringArray("Instituaton",new String[]{"Marks Dental College & Hospital","Apollo Hospitals Dhaka"});


                  bundle.putStringArray("champer",new String[]{"Islami Bank Central Hospital","AFMC - Armed Forces Medical College"});
                  bundle.putStringArray("Phone",new String[]{"029355801","02840166"});

                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Diabetics Specialist Doctor
              if(positon==6){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Dr. Indrajit Prasad","Dr. Md. Feroz Amin"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, FCPS, MD, MACE ( USA )","MBBS, MD ( Endocrinology )"});
                  bundle.putStringArray("Expertise",new String[]{"Diabetes & Endocrine","Hormone & Diabetes"});
                  bundle.putStringArray("Instituaton",new String[]{"Sir Salimullah Medical College (SSMC)","BIRDEM Hospital & Ibrahim Medical College"});


                  bundle.putStringArray("champer",new String[]{"Labaid Specialized Hospital","Comfort Diagnostic Centre & Comfort Nursing Home"});
                  bundle.putStringArray("Phone",new String[]{"028610793","028124990"});

                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }


              //ENT - Ear, Nose & Throat Specialist
              if(positon==7){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. A.F. Mohiuddin Khan","Dr. Mahmudul Hasan"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, DLO, MS ( ENT)","MBBS, FCPS ( ENT )"});
                  bundle.putStringArray("Expertise",new String[]{"ENT - Head & Neck Surgeon","ENT - Ear, Nose & Throat"});
                  bundle.putStringArray("Instituaton",new String[]{"Dhaka Medical College & Hospital, Dhaka","Shaheed Suhrawardy Medical College (SHSMC)"});


                  bundle.putStringArray("champer",new String[]{"Japan Bangladesh Friendship Hospital","Aysha Memorial Specialised Hospital"});
                  bundle.putStringArray("Phone",new String[]{"029672277","029122689"});


                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Eye ( Ophthalmology ) Specialist
              if(positon==8){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. Md. Saleh Uddin","Dr. Hiramoni Sarma"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, FCPS, MS, MPhD ( Australia ), FICS, FCPS","MBBS, DOMS, Fellow Retinal lasers"});
                  bundle.putStringArray("Expertise",new String[]{"Eye ( Ophthalmology )","Eye ( Ophthalmology )"});
                  bundle.putStringArray("Instituaton",new String[]{"Retired from BSMMU","SQUARE Hospital Ltd, Dhaka, Bangladesh"});


                  bundle.putStringArray("champer",new String[]{"Northern International Medical College & Hospital","SQUARE Hospitals Ltd."});
                  bundle.putStringArray("Phone",new String[]{"028156914","028159457"});



                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Gastroenterology Specialist
              if(positon==9){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. A.S.M.A Raihan","Professor Dr. Faruque Ahmed"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, MD (Gastro), FRCP (edin)","MBBS, FCPS ( Med. ), MD ( Gastro.)"});
                  bundle.putStringArray("Expertise",new String[]{"Gastroenterology","Gastroenterolog"});
                  bundle.putStringArray("Instituaton",new String[]{"Bangabandhu Sheikh Mujib Medical University ( BSMMU )","Dhaka Medical College & Hospital"});


                  bundle.putStringArray("champer",new String[]{"AFMC - Armed Forces Medical College","Popular Diagnostic Centre Ltd - Dhanmondi Branch"});
                  bundle.putStringArray("Phone",new String[]{"01553341063","01553341063"});


                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Gynecology & Obstetrics
              if(positon==10){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. Md. Jalilur Rahman","Professor Dr. Manjur Morshed"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, M.Phil, FCPS, FRCP (Edin), FRCP (Glasgow)","MBBS, FCPS, MRCP(UK)"});
                  bundle.putStringArray("Expertise",new String[]{"Hematology","Clinical Hematology"});
                  bundle.putStringArray("Instituaton",new String[]{"Bangabandhu Sheikh Mujib Medical University ( BSMMU )","Bangabandhu Sheikh Mujib Medical University"});


                  bundle.putStringArray("champer",new String[]{"Padma Diagnostic Center Ltd","Labaid Specialized Hospital"});
                  bundle.putStringArray("Phone",new String[]{"029350383","028610793"});

                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Kidney Specialist Doctor
              if(positon==11){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. Md. Abul Mansur","Professor Dr. Md. Nizamuddin Chowdhury"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, MD, Dip. in Nephro","MBBS, MCPS, MD ( Nephrology ), FASN ( USA ), Fellow ISN ( Canada )"});
                  bundle.putStringArray("Expertise",new String[]{"Hemodialysis - Kidney","Kidney ( Nephrology )"});
                  bundle.putStringArray("Instituaton",new String[]{"BIRDEM ( Bangladesh Institute of Research and Rehabilitation for Diabetes )","Dhaka Medical College & Hospital"});


                  bundle.putStringArray("champer",new String[]{"BIRDEM(Bangladesh Institute of Research and Rehabilitation for Diabetes)","Popular Diagnostic Centre Ltd - Dhanmondi Branch"});
                  bundle.putStringArray("Phone",new String[]{"028616641","01553341063"});


                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Cardiology specialist
              if(positon==12){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. Abu Azam","Dr. Md. Rois Uddin"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, MD, FRCP ( UK ), FACC ( USA )","MBBS, MD ( Cardiology )"});
                  bundle.putStringArray("Expertise",new String[]{"Medicine & Cardiology","Medicine & Cardiolog"});
                  bundle.putStringArray("Instituaton",new String[]{"National Heart Institute","Rajshahi Medical College & Hospital"});


                  bundle.putStringArray("champer",new String[]{"Sigma Medical Services","Popular Diagnostic Centre Ltd. - Shyamoli Branch"});
                  bundle.putStringArray("Phone",new String[]{"029101641","01553341660"});

                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }
              //Orthopedics Specialist
              if(positon==13){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Dr. Pervez Ahsan","Dr. A.N.M. Harunur Rashid ( Uzzal )"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, MS ( Ortho )","MBBS, MS ( Ortho )"});
                  bundle.putStringArray("Expertise",new String[]{"Orthopaedic Surgeon","Orthopaedic Surgeon"});
                  bundle.putStringArray("Instituaton",new String[]{"Ibn Sina Medical College, Dhaka","Sir Salimullah Medical College & Mitford Hospital"});


                  bundle.putStringArray("champer",new String[]{"City Hospital Ltd","Popular Diagnostic Centre Ltd - Dhanmondi Branch"});
                  bundle.putStringArray("Phone",new String[]{"028143312","01553341060"});

                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }


              //Radiology Specialist
              if(positon==14){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Dr. Md. Delwar Hossain","Dr. Shahnaz Chowdhury"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS (Dhaka), DMRD (D.U.)","MBBS, M.Phil ( Radiology & Imaging )"});
                  bundle.putStringArray("Expertise",new String[]{"Radiology","Radiology & Imaging"});
                  bundle.putStringArray("Instituaton",new String[]{"National Institute of Ophthalmology & Hospital, Dhaka","Bangabandhu Sheikh Mujib Medical University (BSMMU)"});


                  bundle.putStringArray("champer",new String[]{"AFMC - Armed Forces Medical College","Aysha Memorial Specialised Hospital"});
                  bundle.putStringArray("Phone",new String[]{"029350383","029122689"});

                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }

              //Urology Specialist
              if(positon==15){
                  Bundle bundle = new Bundle();
                  bundle.putStringArray("arrayOfName", new String[]{"Professor Dr. AKM Anwarul Islam","Professor Dr. Mirza M H Faisal"});
                  bundle.putStringArray("designaiton",new String[]{"MBBS, FCPS, FRCS, FICS Clinical Fellow in Urology (WHO)","MBBS, FCPS, FRCS (Ed), FICS"});
                  bundle.putStringArray("Expertise",new String[]{"Urology","Urology"});
                  bundle.putStringArray("Instituaton",new String[]{"Bangabandhu Sheikh Mujib Medical University ( BSMMU )","BIRDEM Hospital & Ibrahim Medical College"});


                  bundle.putStringArray("champer",new String[]{"Popular Diagnostic Centre Ltd - Dhanmondi Branch","Popular Diagnostic Centre Ltd - Dhanmondi Branch"});
                  bundle.putStringArray("Phone",new String[]{"029134407","029669480"});


                  bundle.putString("data",name);
                  Intent intent=new Intent(Specilist_Doctor.this,DoctorName.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }





          }

      });


    }
}
